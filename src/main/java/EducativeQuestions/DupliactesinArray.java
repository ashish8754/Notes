package EducativeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DupliactesinArray {
    public static ArrayList< Integer > findDuplicates(int[] arr) {
        ArrayList < Integer > duplicates = new ArrayList < Integer > ();
       //note creating freqMap to keep track of frequency of each variable
        HashMap<Integer, Boolean> freqMap=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            //note if the element being added to map already exists as key in map then we add the value to the arraylist to return, else we add the value
            //note to map as key with value 1
            if(freqMap.containsKey(arr[i])){
                if(duplicates.contains( arr[i]))
                    continue;
                else
                    duplicates.add(arr[i]);
            }

            freqMap.put(arr[i],true ) ;
        }
        // write your code here

        return duplicates;
    }

    public int findSecondMaximum(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int secMax=max;
        // Write - Your - Code
        for(int i=0;i<arr.length;i++){

            if(arr[i] > max)
                secMax=max;
                max=arr[i];
        }
        return secMax;
    }

    public static void main(String[] args) {
        int arr[] = {
                7,
                5,
                4,
                3,
                5,
                11,
                11,
                3,
                11
        };
        ArrayList < Integer > dupes = findDuplicates(arr);
        System.out.println("Duplicates in " + Arrays.toString(arr) + " are " + dupes);

        int arr1[] = {
                6,
                5,
                17,
                17
        };
        dupes = findDuplicates(arr1);
        System.out.println("Duplicates in " + Arrays.toString(arr1) + " are " + dupes);
    }
}
