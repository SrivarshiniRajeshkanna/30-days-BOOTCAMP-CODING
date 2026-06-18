import java.util.*;
public class Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++){
            if(arr[i] %2 == 0){
            System.out.println(arr[i]+" "+ " is divisible by 2");
            }
            else if((arr[i] %2==0 && arr[i] %7==0)){
                System.out.println(arr[i]+ " "+ "is divisible by 2 and 7");
            }
            else if(arr[i] %7 == 0 ){
                System.out.println(arr[i]+ " "+ "is divisible by 7");
            }
            else{
                System.out.println(arr[i]+ " "+ "is not divisible by 2 and 7");
            }
        }

    }
}
