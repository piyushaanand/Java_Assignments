import java.util.Scanner;
public class A3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks scored by Student : ");
        int m = sc.nextInt();
        switch(m/10){
            case 10 :
            case 9 :
                System.out.println("Grade is O");
                break;
            case 8:
                System.out.println("Grade is A");
                break;
            case 7 :
                System.out.println("Grade is B");
                break;
            case 6 :
                System.out.println("Grade is C");
                break;
            case 5 :
                System.out.println("Grade is D");
                break;
            case 4:
                System.out.println("Grade is E");
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("Grade is F");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
