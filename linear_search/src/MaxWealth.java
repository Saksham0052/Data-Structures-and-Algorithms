public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {3, 7},
                {3 , 5}
        };
        System.out.println(maxWealth(accounts));

    }

    static int maxWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int person = 0 ; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
