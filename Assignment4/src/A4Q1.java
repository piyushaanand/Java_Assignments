import java.util.Scanner;
public class A4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        int sum = 0 ;
        for(int i=a;i<=b;i+=c){
            System.out.println("i = "+i);
            sum+=i;
        }
        System.out.println("The sum of the number displayed : "+sum);
    }
}
