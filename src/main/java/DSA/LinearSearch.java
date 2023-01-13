package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    //Basic demonstration of linear search through some examples
    public static void main(String[] args) {

        int[] arr={5,7,9,87,45,56,2,34};
        int target=45;
        int ans=linearSearch(arr, target);// linear search on a given array of int
        System.out.println("Linear search in int array answer : "+ ans );
        target=5;
        ans =searchInRange(arr,target,2,5);//linear search in an array in given range of indices
        System.out.println("Linear search in range answer : "+ ans );
        char targetChar= 'a';
        String subject="The quick brown fox jumps over the lazy dog";
        ans=searchInString(subject,targetChar);//linear search in string for characters
        System.out.println("Linear search for string answer: " +ans);
        minNumInArray(arr);
        target=8;
        int [][] arr2d={ {1,5,7},{34,65,98},{3,56,9}};
        int [] ans2d=searchIn2dArray(arr2d,target);//linear search in 2 dimensional array
        System.out.println("Search in 2d Array answer: "+ Arrays.toString(ans2d));
        maxValue(arr2d);
    }

    private static void maxValue(int[][] arr2d) {
        //take min int value or first element of the array as max, keep comparing with the other elements in linear manner
        //if element value>max value replace max, and return max value in end
        int max=Integer.MIN_VALUE;
        for(int[] a:arr2d)
        {
            for(int b:a)
            {
                if(b>max)
                    max=b;
            }
        }
        System.out.println("Max value in 2d Array : "+max);
    }

    private static int[] searchIn2dArray(int[][] arr2d, int target) {
        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                if(target==arr2d[i][j])
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    private static void minNumInArray(int[] arr) {
        //take max int value or first element of the array as min, keep comparing with the other elements in linear manner
        //if element value<min value replace min, and return min value in end
        int min=Integer.MAX_VALUE;
        for(int a : arr)
        {
            if(a<min)
                min=a;
        }
        System.out.println("Min value in array: "+min);
    }

    private static int searchInRange(int[] arr, int target, int start, int end) {
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    private static int searchInString(String subject, char targetChar) {
        for(int i=0;i<subject.length();i++)
        {
            if(targetChar==subject.toCharArray()[i])
                return i;
        }
        return -1;
    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length==0)
            return -1;

        for (int i = 0; i < arr.length; i++)
        {
           if(arr[i]==target)
               return i;
        }

        return -1;

    }
}
