package DSA;

public class NumbersEvenNumberDigits {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(digits(-78965));
        int result=evenDigitsNumCount(arr);
        System.out.println("Even digit number count in array: "+result);
    }

    private static int evenDigitsNumCount(int[] arr) {
        int count=0;
        for(int element:arr)
        {
            if(isEvendigits(element))
                count++;
        }
        return count;
    }

    static boolean isEvendigits(int number)
    {
        int digitCount=digits(number);
        return digitCount%2 ==0;
    }

    static int digits(int number)
    {
        if(number < 0)
            number=number * -1;

        return (int)(Math.log10(number)) +1;
    }

}
