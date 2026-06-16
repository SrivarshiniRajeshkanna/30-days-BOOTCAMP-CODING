import java.util.*; 
public class sortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] %2==0){
                result[evenIndex++] = nums[i];
            }
            else{
                result[oddIndex--] = nums[i];
            }
        }
        return result;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.println("Enter the elements of the array:");
            for(int i=0; i<size;i++){
                nums[i] = sc.nextInt();
            }
            sortArrayByParity solution = new sortArrayByParity();
            int[] sortedArray = solution.sortArrayByParity(nums);
            System.out.println("Sorted array by parity:");
            for(int num : sortedArray){
                System.out.print(num + " ");
            }
            sc.close();
        }
    }

//     // class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//        int temp;
//        for(int i=0;i<nums.length-1;i++){
//         for(int j=0;j<nums.length-1;j++){
//            if(nums[j]%2!=0){
//               temp=nums[j];
//                nums[j]=nums[j+1];
//                nums[j+1]=temp;
//            }
//        }
//        }
//         return nums;
//     }
// }