package Arrays.BuySellStock;

import java.util.Scanner;
//! Time Complexity = O(n^2)
//? Space Complexity = O(1);
public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(profit(prices));
        sc.close();
    }
    public static int profit(int[] prices){
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j >= 0; j--){
                profit = Math.max(profit, prices[i] - prices[j]);
            }
        }
        return profit;
    }
}
