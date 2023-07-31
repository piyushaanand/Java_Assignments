import java.util.Scanner;
public class A4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int r;
        int sum = 0;
        while (num != 0) {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        if (sum % 9 == 0) {
            System.out.println("The number is divisible by 9");
        } else {
            System.out.println("The number is not divisible by 9");
        }

    }
}
