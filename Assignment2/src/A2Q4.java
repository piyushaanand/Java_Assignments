import java.util.Scanner;
public class A2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        sum = sum +(num%10);
        num = num/10;
        sum= sum+(num%10);
        num=num/10;
        sum=sum+(num%10);
        System.out.println(sum);
    }
}
