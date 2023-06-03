package EducativeQuestions.DynamicProgramming;

class KnapsackProblem
{
    //Note first we try the recursive solution
    static int Knapsack(int profits[], int profitsLength, int weights[], int weightsLength, int capacity,int currentindex)
    {
        if(capacity<=0 || currentindex >=profitsLength || currentindex<0 || weightsLength != profitsLength )
            return 0;

        int profit1=0;
        if(weights[currentindex] <= capacity){
            //taking the current item and making recursive call to calculate max profit if the current item is included
            profit1=profits[currentindex]+ Knapsack(profits,profitsLength,weights,weightsLength,capacity-weights[currentindex],currentindex+1);
        }
        //Also maintaining profit if the current item is not added to list
        int profit2= Knapsack(profits,profitsLength,weights,weightsLength,capacity,currentindex+1);

        // write your code here
        return  Math.max(profit1,profit2);
    }

    //Note: here we added a lookup table to the above recursive function to reduce time complexity from exponential to linear
    static int knapsackrecursive(int[][] lookup,int[] profits,int profitsLength, int weights[], int weightsLength, int capacity,int currentindex){
        if(capacity<=0 || currentindex >=profitsLength || currentindex<0 || weightsLength != profitsLength )
            return 0;

        if(lookup[currentindex][capacity]!=0)
            return lookup[currentindex][capacity];

        int profit1=0;
        if(weights[currentindex]<=capacity){
            profit1=profits[currentindex]+knapsackrecursive(lookup,profits,profitsLength,weights,
                    weightsLength,capacity-weights[currentindex],currentindex+1);
        }
        int profit2=knapsackrecursive(lookup,profits,profitsLength,weights,weightsLength,capacity,currentindex+1);

        lookup[currentindex][capacity]=Math.max(profit1,profit2);

        return lookup[currentindex][capacity];

    }

    static int Knapsack(int[] profits,int profitsLength, int weights[], int weightsLength, int capacity){

        int[][] lookuptable=new int[profitsLength][];

        for(int i =0;i<lookuptable.length;i++){
            lookuptable[i]=new int[capacity+1];
            for(int j=0;j<capacity+1;j++ ){
                lookuptable[i][j]=0;
            }
        }

        return knapsackrecursive(lookuptable,profits,profitsLength,weights,weightsLength,capacity,0);
    }

    public static int knapSacktabulated(int profits[], int profitsLength, int weights[], int weightsLength, int capacity) {
        // Basic checks
        if (capacity <= 0 || profitsLength == 0 || weightsLength != profitsLength)
            return 0;

        int i, w;
        int[][]lookupTable = new int[profitsLength + 1][capacity + 1];

        // Building the lookup table in bottom up manner
        for (i = 0; i <= profitsLength; i++) {
            for (w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    lookupTable[i][w] = 0;
                else if (weights[i - 1] <= w)
                    lookupTable[i][w] = Math.max(profits[i - 1] + lookupTable[i - 1][w - weights[i - 1]], lookupTable[i - 1][w]);
                else
                    lookupTable[i][w] = lookupTable[i - 1][w];
            }
        }

        return lookupTable[profitsLength][capacity];
    }


    public static void main(String[] args) {

        int profits[] = {1, 6, 10, 16}; // The values of the jewelry
        int weights[] = {1, 2, 3, 5}; // The weight of each
        //System.out.println("Total knapsack profit ---> " + Knapsack(profits, 4, weights, 4,  7, 0));
        System.out.println("Total knapsack profit1 ---> " + Knapsack(profits, 4, weights, 4, 6, 0));
        System.out.println("Total knapsack profit2 ---> " + Knapsack(profits, 4, weights, 4, 6));
        System.out.println("Total knapsack profit3 ---> " + knapSacktabulated(profits, 4, weights, 4, 6));
    }
};
