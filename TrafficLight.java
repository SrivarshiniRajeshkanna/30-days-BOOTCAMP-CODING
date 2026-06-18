import java.util.*;
public class TrafficLight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of the traffic light");
        String color = sc.nextLine();
        switch(color.toLowerCase()){
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
        }
        sc.close();
    }
}
