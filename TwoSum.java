import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
// Here Arrays.toString() is used to convert the result array to a string representation for easy printing.
/** it stores the array as a string in the format "[element1, element2, ...]" which makes it easier to read and understand the output.
then when it is printed it prints only [element1 , element2] **/