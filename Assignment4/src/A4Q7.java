import java.util.Scanner;
public class A4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of required table : ");
        int num = sc.nextInt();
        System.out.println("The multiplication table of "+num+" is : ");
        for(int i=1 ;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
