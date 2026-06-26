import java.util.*;
public class buyandsellstock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        int buy = prices[0];
        int profit =0;
        for(int i=0; i<n; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        System.out.println(profit);
    }
}
