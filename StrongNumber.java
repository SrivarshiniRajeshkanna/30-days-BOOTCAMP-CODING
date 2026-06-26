// import java.util.*;
// public class StrongNumber {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int originalNumber = num;
//         int temp = Math.abs(num);
//         int count =0;
//         while(temp!=0){
//             count++;
//             temp = temp/10;
//         }
//         int arr[] = new int[count];
//         temp = Math.abs(num);
//         int divisor = 1;
//         int copynum = num;
//         while(copynum>9){
//             divisor = divisor*10;
//             copynum = copynum/10;
//         }
//         for(int i=0; i<count; i++){
//             arr[i] = temp/divisor;
//             temp = temp%divisor;
//             divisor = divisor/10;
//         }
//         long add =0;
//         for(int n=0; n<arr.length; n++){
//             long fact =1;
//             for(int j=1; j<=arr[n]; j++){
//                 fact = fact*j;
//             }
//          add = add + fact;
//         }
//         if(add == Math.abs(num)){
//             System.out.println(originalNumber +" "+"The number is a Strong Number.");
//         } else {
//             System.out.println(originalNumber +" "+"The number is not a Strong Number.");
//         }
//     }
// }


import java.util.*;
public class StrongNumber{
    private static final int[] fact= {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        if(!sc.hasNextInt()){
            System.out.println("Enter a Valid Input");
            return;
        }
        int num = sc.nextInt();
        int originalnum = num;
        int temp = Math.abs(num);
        int sum =0;
        if(temp==0){
            sum = 1;
        }
        while(temp!=0){
            int digit = temp%10;
            sum = sum +fact[digit];
            temp = temp/10;
        }
        if(sum == Math.abs(originalnum)){
            System.out.println("It is a Strong Number");
        }
        else{
            System.out.println("It is not a Strong Number");
        }
        sc.close();
    }
}


