import java.util.Scanner;
public class HA3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter today's Day : ");
        int td = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today : ");
        int ed= sc.nextInt();
        int fd = (td + ed)%7;
        String a = " ";
        switch (td){
            case 0 : a= "Sunday";break;
            case 1 : a="Monday";break;
            case 2 : a="Tuesday";break;
            case 3 : a="Wednesday";break;
            case 4 : a="Thursday";break;
            case 5 :a= "Friday";break;
            case 6 :a="Saturday";break;
        }
        String b = " ";
        switch (fd){
            case 0 : b = "Sunday " ;break;
            case 1 : b = "Monday ";break;
            case 2 : b = "Tuesday ";break;
            case 3 : b = "Wednesday ";break;
            case 4 : b = "Thursday ";break;
            case 5 : b = "Friday ";break;
            case 6 : b = "Saturday ";break;
        }
        System.out.println("Today is "+a+" and the future day is "+b);
    }
}
