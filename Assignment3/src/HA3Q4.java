import java.util.Scanner;
public class HA3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean a = false;
        boolean o = false;
        boolean an = false;
        if(num%5==0&&num%6==0){
            a = true ;
            o = true ;
        } else if ((num%5==0&&num%6!=0)||(num%5!=0&&num%6==0)) {
            o = true ;
            an = true ;
        }else {
             a = false;
             o = false;
             an = false;
        }
        System.out.println("Is "+num+" divisible by 5 and 6 ? : "+a);
        System.out.println("Is "+num+" divisible by 5 or 6 ? : "+o);
        System.out.println("Is "+num+" divisible by 5 and 6 but not both ? : "+an);
    }
}
