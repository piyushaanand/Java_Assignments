import java.util.Scanner;
public class A4Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter p : ");
        int p = sc.nextInt();
        int num=1;
        for(int i = 1 ;i<=p;i++ ){
            num = num*b;
        }
        System.out.println(b+" raise to the Power "+p+" is "+num);
    }
}
