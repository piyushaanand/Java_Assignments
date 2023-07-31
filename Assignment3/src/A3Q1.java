import java.util.Scanner;
public class A3Q1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter age : ");
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("You are eligeble to cast your vote");
            }
            else{
                System.out.println("You are not eligeble to cast vote");
            }sc.close();
    }
}
