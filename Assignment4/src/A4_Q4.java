import java.util.Scanner;
public class A4_Q4 {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        int r ;
        int cx = x ,cy=y;
        while(y!=0){
           r= x%y;
           x=y;
           y=r;
        }
        System.out.println("The gcd of "+cx+" and "+cy+" is "+x);

    }
}
