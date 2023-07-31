import java.util.Scanner;
public class A3Q4 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a number netween 1 to 9 : ");
           int a = sc.nextInt();
           int b =(int)(1+ Math.random()*(9+1-1));
           System.out.println("computer guess = "+b);
           if(a==b){
               System.out.println("You got it Right .");
           }else if((a+1)==b || (a-1)==b){
               System.out.println(" Almost you got it .");
           }else{
               System.out.println(" You got it Wrong .");
           }sc.close();
    }
}
