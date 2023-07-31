import java.util.Scanner;
public class A4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number : ");
        int x = sc.nextInt();
        System.out.println("Enter second number : ");
        int y = sc.nextInt();
        int r = Math.min(x,y);
        while(r>0){
            if(x%r == 0 && y%r==0){
                       break;
            }
            r--;
        }
        System.out.println("The GCD of "+x+" and "+y+" is "+r);
    }
}
