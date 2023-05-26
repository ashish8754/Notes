package EducativeQuestions;

import java.util.HashMap;

public class CountOccurences {

    public static int calcFreq(int arr[], int key) {

        //note first we find the first occurence in the array using binarySearch
        int index=binarySearch(arr,key);
        //note if element is not found return 0
        if(index==-1)
            return 0;

        //note else initialise count to 1 since atleast 1 occurence is there
        int count=1;
        int start=index-1;
        //note now since its a sorted array all the occuerences will be together so we ccheck in left and right half for other occurences
        while(start>=0 && arr[start]==key){
            count++;
            start--;
        }

        int end=index+1;
        while(end<arr.length && arr[end]==key){
            count++;
            end++;
        }
        //note TimeComplexity-O(logn)+O(Count) can be close to O(n) for worst cases


        return count;
    }

    public static int calcFreq2(int[] arr,int key){
        int start=0,end=arr.length-1,mid,result=1;


        //note Modifying the binarySearch to find first and last occurrences of the key,then return res2-res1+1 to get total occurrences

        while(start<=end){
            mid=(start+end)/2;

            if(arr[mid]==key){
                result=mid;
                end=mid-1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }else if(arr[mid]<key) {
                start=mid+1;
            }
        }

        start=0;
        end=arr.length-1;
        int result2=-1;

        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                result2=mid;
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }else if(arr[mid]<key) {
                start=mid+1;
            }
        }

        if(result==-1 || result2==-1){
            return (result2-result);
        }

        return (result2-result+1);

    }


    public static void main(String[] args) {
        int[] ipArr={-5,-3,0,1,3,3,3,3,3,4,4,5};
        int key=4;

        int result=calcFreq2(ipArr,key);
        System.out.println(result);

    }

    public static int binarySearch(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;

            if(arr[mid]< target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}
