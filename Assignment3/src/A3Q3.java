import java.util.Scanner;
public class A3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c && b>c){
            System.out.println("Decreasing");
        }else if(a<b && a < c && b<c){
            System.out.println("Increasing");
        }else {
            System.out.println("Neither Increasing nor Decreasing");
        }sc.close();
    }
}
