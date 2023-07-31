import java.util.Scanner;
public class A3Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x axis : ");
        double x = sc.nextDouble();
        System.out.print("Enter y axis : ");
        double y = sc.nextDouble();
        if(x==0&&y==0){
            System.out.println("Origin");
        }else if(x==0&&y!=0){
            System.out.println("y-axis");
        }else if(x!=0&&y==0){
            System.out.println("x-axis");
        }else if(x>0&&y>0){
            System.out.println("First Quadrant");
        }else if(x<0&&y>0){
            System.out.println("Second Quadrant");
        }else if(x<0&&y<0){
            System.out.println("Third Quadrant");
        }else{
            System.out.println("Fourth Quadrant");
        }
    }
}
