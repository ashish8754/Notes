package Basics;

public class ShadowingEx {
    static int x=90;//class variable declared inside class but outside any function, kind of like global variable from c++

    public static void main(String[] args) {
        System.out.println(x);//here it will display the value of the class variable

        int x;//declaring local variable of the same name but not initialised, here the class var x will get shadowed.

        //System.out.println(x); this line will give error since the local variable is not initialised

        x=20;//have initialised the variable now it can be used inside the function
        System.out.println(x);//will display the local value
        {
            x=30;//cannot initialise again since a local var x is already defined in the scope of main and this block is inside main
            int c=25;//new var defined inside this block, cannot be accessed outside this block since its scope is limited to this block only
            System.out.println(c);
            System.out.println(x);

        }

        for (int i=1;i<2;i++)
        {
            System.out.println(i);//i is only visible inside this for loop since it was initialised inside the for block, cant access outside for
        }
        //System.out.println(i);will throw error as i is only visible inside for block

        displayX();

    }

    private static void displayX() {
        System.out.println(x);//here it will display the class var value since the local x for main is only visible in the scope of main
    }

}
