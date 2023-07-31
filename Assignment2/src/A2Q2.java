import java.util.Scanner;
public class A2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter diatance in km : ");
        int km = sc.nextInt();
        double feet = 3280.8399*km;
        double m = km*1000;
        double cm = km*100000;
        double inch = km*39370.0787;
        System.out.println(km+" km is "+m+" metres .");
        System.out.println(km+" km is "+feet+" feet .");
        System.out.println(km+" km is "+inch+" inch .");
        System.out.println(km+" km is "+cm+" centimetres .");
    }
}
