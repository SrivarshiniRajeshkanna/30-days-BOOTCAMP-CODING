import java.util.*;
public class CheckoutSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Store Checkout System---");
        
        System.out.print("Enter the item quantity:");
        int quantity = sc.nextInt();

        System.out.print("Enter the unit price:");
        double price = sc.nextDouble();
         
        System.out.print("Enter the Type of payment");
        String s = sc.nextLine();
    }
}