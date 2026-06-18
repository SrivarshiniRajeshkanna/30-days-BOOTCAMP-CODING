import java.util.*;
public class primenobetween_50{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count =1;
        for(int i =2; i<=n; i++){
            if(n%i==0 && i!=n){
                count++;
            }
            else{
                System.out.print(i +" ");
            }
        }
        if(count==2){
            System.out.println(n +" "+ "is a prime no");
        }
        else{
            System.out.println("The given no is not a prime no");
        }
        sc.close();
    }
}
