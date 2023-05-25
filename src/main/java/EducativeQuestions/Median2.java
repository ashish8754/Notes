package EducativeQuestions;

import java.util.Arrays;

public class Median2 {

    public static double getMedian(int array1[], int array2[]) {
        //note BruteForce Approach

        int sizeArr1=array1.length;
        int sizeArr2=array2.length;
        int totSize=sizeArr1+sizeArr2;
        int mid=totSize/2;

        int i=0;
        int j=0;
        int count;
        int median =-1;
        int prevMedian=-1;

        for(count=0;count<=mid;count++){
            prevMedian=median;
            if(i != sizeArr1 && j !=sizeArr2){
                if(array1[i] > array2[j]){
                    median=array2[j];
                    j++;
                }else {
                    median=array1[i];
                    i++;
                }
            }else if(i < sizeArr1){
                median=array1[i];
                i++;
            }else{
                median=array2[j];
                j++;
            }
        }

        if(totSize%2 ==1){
            return median;
        }else{
            return (median+prevMedian)/2.0;
        }
    }

    static double getMedian2(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int end_index = size1;
        int start_index = 0, i = 0, j = 0, median = 0;

        while (start_index <= end_index) {
            i = (start_index + end_index) / 2;
            j = ((size1 + size2 + 1) / 2) - i;

            if (i < size1 && j > 0 && array2[j - 1] > array1[i])
                start_index = i + 1;

            else if (i > 0 && j < size2 && array2[j] < array1[i - 1])
                end_index = i - 1;

            else {
                if (i == 0)
                    median = array2[j - 1];

                else if (j == 0)
                    median = array1[i - 1];
                else
                    median = Math.max(array1[i - 1],
                            array2[j - 1]);
                break;
            }
        }

        if ((size1 + size2) % 2 == 1)
            return (double) median;


        if (i == size1)
            return (median + array2[j]) / 2.0;


        if (j == size2)
            return (median + array1[i]) / 2.0;

        return (median + Math.min(array1[i],
                array2[j])) / 2.0;
    }


    public static void main(String[] args) {
            int array1[] = {
                    4,
                    5,
                    7,
                    10
            };
            int array2[] = {12, 13,15,18,20,24};

            System.out.println("The median of " + Arrays.toString(array1) + " and " + Arrays.toString(array2) + " is " + getMedian2(array1, array2));

            // Example 2
            int array3[] = {1,2,3,4,5};
            int array4[] = {100,200,300,400};

            System.out.println("The median of " + Arrays.toString(array3) + " and " + Arrays.toString(array4) + " is " + getMedian2(array3, array4));
        }
    }

