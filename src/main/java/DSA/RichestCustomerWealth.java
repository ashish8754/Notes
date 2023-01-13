package DSA;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
        int maxWealth= richestCustomer(accounts);
        System.out.println("Max wealth : "+maxWealth);
    }

    private static int richestCustomer(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int[] rows:accounts)
        {
            int sumOfRow=rowSum(rows);
            if(max<=sumOfRow)
                max=sumOfRow;
        }
        return max;
    }

    private static int rowSum(int[] rows) {
        int sum=0;
        for(int element:rows){
            sum+=element;
        }
        return sum;

    }
}
