import java.util.Scanner;
public class HA2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes : ");
        int m = sc.nextInt();
        int y = m/(365*24*60);
        int d = m%365*24*60/(24*60);
        System.out.println(m+" minutes is aprroximately "+y+" years and "+d+" days.");
    }
}
