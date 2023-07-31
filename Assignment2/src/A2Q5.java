import java.util.Scanner;
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere : ");
        int r = sc.nextInt();
        double V=(2.0/3.0) * (Math.PI*Math.pow(r,3));
        double SA = 3*Math.PI*Math.pow(r,2);
        System.out.println("Surface Area of Hemisphere : "+SA);
        System.out.println("Volume of Hemisphere : "+V);
    }
}
