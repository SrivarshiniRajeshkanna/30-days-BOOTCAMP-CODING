import java.util.*;
public class maxProfit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] prices = new int[size];
        for(int i=0; i<size; i++){
            prices[i] = sc.nextInt();
        }
        int buy = prices[0];
        int profit = 0;
        for(int i=1; i<size; i++){
            if(prices[i]<buy){
                buy =prices[i];
            }
            else if(prices[i] -buy > profit){
                profit = prices[i] -buy;
            }
        }
        System.out.println(profit);
    }
}