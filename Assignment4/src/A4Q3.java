import java.util.Scanner;
public class A4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum =0 ,i =1;
        do{
            int ran = (int)(1+ Math.random()*(a-1+1));
            System.out.println(ran);
            sum = sum + ran;
            i++;
        }while(i<=a);
        System.out.println("The Average of the Random numbers : "+sum/(double)a);
    }
}
