import java.util.Scanner;
public class A4Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int cg = (int) ((1 + Math.random() * (10 - 1 + 1)));
            System.out.println("Computer guess is : "+cg);
            System.out.print("Enter user guess : ");
            int ug = sc.nextInt();
            if(cg==ug){
                System.out.println("Good Guess !!!");break;
            }else if(cg>ug){
                System.out.println("To Low try again !!!");
            }else{
                System.out.println("To high try again !!!");
            }
        }
    }
}
