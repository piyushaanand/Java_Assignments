import java.util.Scanner;
public class HA3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //0-scissor,1-rock,2-paper
      int com = (int)Math.random()*3;
        System.out.print("Scissors(0) , Rock(1), paper(2) : ");
        int user = sc.nextInt();
        System.out.print("The computer is : ");
        switch (com){
            case 0: System.out.println(" Scissors . ");break;
            case 1 : System.out.println(" Rock . ");break;
            case 2 : System.out.println(" Paper . ");break;
        }
        System.out.print(" You are : ");
        switch (user){
            case 0 : System.out.println(" Scissor . ");break;
            case 1 : System.out.println(" Rock . ");break;
            case 2 : System.out.println("Paper .");break;
        }
        if(com==user){
            System.out.println("It is a Draw !!!");
        } else if((user == 1 && com==0)||(user==0&&com==2)||(user==2&&com==1)){
            System.out.println("You won!!!");
        }else {
            System.out.println("You loose !!!");
        }
    }
}
