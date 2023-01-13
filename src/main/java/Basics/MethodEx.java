package Basics;

import java.util.Arrays;

class MethodEx
{
    public static void main(String[] args) {
        int a =10;
        int b=20;
        String name="Ashish";
        int[] arr={1,2,3,4,5,6,7};

        //primitive datatype passing in method to understand how it works , as it will not switch the actual value in main since a copy of value is passed
        swap(a,b);
        System.out.println(a+" "+b);

        //same goes for string also , also strings are immutable, so the actual name will not change .
        changeName(name);
        System.out.println(name);

        //here ref copy is passed so any change in the method wil reflect in the actual array too.
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void changeArray(int[] arr2) {
        arr2[0]=66;
    }

    private static void changeName(String name) {
        name="Agarawal";//new object is created when we assign the name variable a new value
    }

    static void  swap(int c,int d)
    {
        int temp=c;
        c=d;
        d=temp;
    }




}