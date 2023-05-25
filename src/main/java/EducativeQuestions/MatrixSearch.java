package EducativeQuestions;

public class MatrixSearch {
    //Search for element in a given 2D Matrix


    public static Object findKey(int[][] matrix, int numberOfRows, int numberOfColumns, int target) {

        //note using binary search to search in each row of the 2D matrix
        //another approach would be to apply binarySearch to the 2D matrix as a whole

        for(int[] row: matrix)
        {
            if(binarySearch(row,target))
                return true;
        }

        return false;
    }

    public static Object findKey2(int[][] matrix,int rowCount,int colCount,int target){

        int min=0;
        int max=rowCount * colCount -1;

        //note TimeComplexity here is O(logn+logm) where n and m are row and columns respectively
        while(min<=max){
            int mid= (min+max)/2;
            int row=mid/colCount;
            int col=mid%colCount;

            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col] < target){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 11, 12, 13},
                {14, 15, 16, 17},
                {27, 29, 30, 31},
                {32, 33, 39, 50}
        };
        // Example 1
        Object x = findKey2(matrix, 4, 4, 80);
        System.out.println("Search for 80 returned: " + x);

        // Example 2
        x = findKey2(matrix, 4, 4, 15);
        System.out.println("Search for 15 returned: " + x);

        x = findKey2(matrix, 4, 4, 31);
        System.out.println("Search for 15 returned: " + x);

        x = findKey2(matrix, 4, 4, 18);
        System.out.println("Search for 15 returned: " + x);
    }

    public static boolean binarySearch(int[] arr, int target){
        int start =0;
        int end =arr.length -1;

        boolean isAsc= arr[start]<arr[end];

        while(start<=end)
        {
            int mid=start + (end-start)/2;//to avoid the possibility of exceeding the int range when adding 2 very large number

            if(arr[mid]==target)
                return true;

            if(isAsc)
            {
                if(arr[mid]< target)
                {
                    start = mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else {
                if(arr[mid]> target)
                {
                    start = mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }

        }
        return false;
    }


}
