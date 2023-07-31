import java.util.Scanner;
public class A4Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int a = num;
        int nnum =0;
        int r ;
        int i =0;
        while(num!=0){
            r=num%10;
            if(r!=0){
                nnum+=r*(int)(Math.pow(10,i));
                i++;
            }
            num=num/10;
        }
        System.out.println("Number after removing all the zeros from "+a+" is "+nnum);
    }
}
