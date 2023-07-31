import java.util.Scanner;
public class A3Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the final unit : ");
        int u = sc.nextInt();
        double p ;
        if(u<=50){
            p=u*50;
        }else if(u<=200){
            p= 50*3+(u-150)*4.80;
        }else if(u<=400){
            p=50*3+150*4.80+(u-200)*5.80;
        }else{
            p=50*3+150*4.80+200*5.80+(u-400)*6.20;
        }
        System.out.println("The Price is : "+p);
        System.out.println("Do you want to pay online y/n : ");
        double d ;
        char ch = sc.next().charAt(0);
        if(ch == 'y'){
            d = 3*p/100;
            System.out.println("Discount : "+d);
            p=p-d;
            System.out.println("Amount payble after discount : "+p);
        }

    }
}
