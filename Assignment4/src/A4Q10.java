import java.util.Scanner;
public class A4Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i=1;
        while(i <= num) {
            i = i * 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + num + " is " + i/3);
    }
}
