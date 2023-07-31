import java.util.Scanner;
public class A2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in sec : ");
        double s = sc.nextDouble();
        double d = (1.0/2.0)*32.174*Math.pow(s,2);
        System.out.println("Distance Travelled : "+d);

    }
}
