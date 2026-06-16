import java.util.*;
public class Maximum_Subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int currentSum = nums[0];
        int maxSum = nums[0];
        int start = 0, end = 0, tempStart = 0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] > currentSum + nums[i]){
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum = currentSum + nums[i];
            }
            
            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        
        for(int i=start; i<=end; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}