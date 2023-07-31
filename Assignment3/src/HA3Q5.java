import java.util.Scanner;
public class HA3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender : ");
        String g = sc.nextLine();
        System.out.print("Enter your first name : ");
        String Fn = sc.nextLine();
        System.out.print("Enter your Last name : ");
        String Ln = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();
        if(g.equals("F")&&age>20) {
            System.out.print("Are you married y/n ? :");
            String married = sc.nextLine();
            if(married.equals("y")){
                System.out.println("Then I must call you Mrs "+Fn+" "+Ln);
            }else{
                System.out.println("Then I must call you Miss "+Fn+" "+Ln);
            }
        }else if(g.equals("M")&&age>20){
            System.out.println("Then I must call you Mr "+Fn+" "+Ln);
        }else{
            System.out.println("Then I must call you "+Fn+" "+Ln);
        }
    }
}
