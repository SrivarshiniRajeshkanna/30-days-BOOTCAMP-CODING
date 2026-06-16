//  Printing Prime no,s less than N

import java.util.*;
public class PrimeNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[] = new boolean[n];
        arr[0] = false;
        arr[1] = false;
        for(int i=2; i<n; i++){
            arr[i] = true;
        }
        if(n<=2){
            System.out.println(" No prime values");
        }
        

    }
}