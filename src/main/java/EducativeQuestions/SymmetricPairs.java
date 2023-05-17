package EducativeQuestions;

import java.util.HashMap;

public class SymmetricPairs {
    public static void main(String[] args) {

        int[][] inputArray={{1,2},{3,4},{5,9},{4,3},{9,5}};
        String result=findSymmetric(inputArray);
        System.out.println(result);
    }

    public static String findSymmetric(int[][] arr) {

        StringBuilder result = new StringBuilder();

        HashMap<Integer,Integer> hMap=new HashMap<>();
        // Write - Your - Code
        int i,j;
        for(i=0;i<arr.length;i++){

            if(hMap.containsKey(arr[i][1])) {
                result.append("{").append(arr[i][1]).append(",").append(arr[i][0]).append("}");
            }
                hMap.put(arr[i][0],arr[i][1]);

        }
        return result.toString();
    }
}
