package EducativeQuestions.DynamicProgramming;

public class Fibonacci {

    /*Note: There are 2 ways to get fibonacci series, 1 by using for loop and calculating in sequence
        2nd way is via recursion which is implemented below, we have the base case of n being <= 1 , in which case we return
        else we return fib(n-1)+fib(n-2), now this solution will end up doing recursive calls a lot, and without memoisation
        the time complexity will be in the exponential range(2^i) as there will be a lot of values that will be repeated but still it would be calculated

     */
    public static int fibrecurive(int n){
        if(n<=1)
            return n;
        return fibrecurive(n-1)+fibrecurive(n-2);
    }

    /*
        Note : now lets try memoization, here we maintain a lookup table where we store the values of each function, so if the value of the function is already
            present in lookup table, it will take the value from there instead of making redundant recursive calls
     */

    public static int fibmemoized(int n, int[] lookup){
        if(n<=1){
            lookup[n]=n;
        }else{
            lookup[n]=fibmemoized(n-1,lookup)+fibmemoized(n-2,lookup);
        }
        return lookup[n];
    }

    //Note: Now lets try with tabulation, tabulation is sort of reverse of recursion, we use bottom down approach
    //  the solution is calculated in 1 iteration

    public static int fibtabulated(int n,int[] lookup){
        lookup[0]=0;
        lookup[1]=1;
        for(int i=2;i<=n;i++){
            lookup[i]=lookup[i-1]+lookup[i-2];
        }
        return lookup[n];
    }

    //Note, Space optimised tabulation
    public static int fibtab2(int n)
    {
        if (n <= 1)
            return n;
        int secondLast = 0; // the zeroth
        int last = 1; // the first
        int current = 0;
        for (int i = 2; i <= n; i++) {
            current = secondLast + last; // the current is the sum of the last plus second last number before the current one
            secondLast = last;
            last = current;
        }
        return current;
    }

    public static void main(String[] args) {
        int result=fibrecurive(5);
        System.out.println(result);

        int input=6;
        int[] lookuptable=new int[input+1];
        //initializing the lookup table
        for(int i=0;i<lookuptable.length;i++){
            lookuptable[i]=-1;
        }
        result=fibmemoized(input,lookuptable);
        System.out.println(result);
        int input2=8;
        int[] lookup2=new int[input2+1];
        System.out.println(fibtabulated(input2,lookup2));

        System.out.println(fibtab2(9));

    }
}
