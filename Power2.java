import java.util.*;
public class Power2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long val =0;
        while(num % 2 == 0 && num>0){
            num = num / 2;
            val = num;
        }
        if(val==1){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        sc.close();
    }
}