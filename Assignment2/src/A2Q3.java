import java.util.Scanner;
public class A2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic Salary : ");
        int BS=sc.nextInt();
        double DA=BS*0.40;
        double HRA=BS*0.20;
        double GS=BS + DA + HRA;
        System.out.println("DA is : "+DA);
        System.out.println("HRA is : "+HRA);
        System.out.println("Gross Salary is : "+GS);
    }
}
