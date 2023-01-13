package Basics;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        //Just some basic example of how ArrayList works

        ArrayList<Integer> arr=new ArrayList<>();
        //adding values to the arraylist
        for (int i = 1; i <= 9; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        reverseArray(arr);

//        swap(arr,3,7);
        System.out.println(arr);

    }

    private static void reverseArray(ArrayList<Integer> arr) {
        int start=0;
        int end=arr.size()-1;
        //using the swap function we created to reverse the whole array
        while(start < end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(ArrayList<Integer> arr,int index1,int index2)
    {
        //Swap function to swap variables between 2 indices
        int temp=arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2,temp);

    }



}
