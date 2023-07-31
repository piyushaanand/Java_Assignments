import java.util.Scanner;
public class A2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp. in F : ");
        float f = sc.nextFloat();
        float C = (float) ((f-32)*(5.0/9.0));
        System.out.println(f+" Fahrenheit is "+C+" degree celsius.");


    }
}
