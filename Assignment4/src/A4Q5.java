import java.util.Scanner;
public class A4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        int sum =0;
        int r;
        int i = 1;
        while(i<=(num/2)){
            r=num%i;
            if(r%i==0){
                sum = sum + i;
            }
            i++;
        }
        if(sum==num){
            System.out.println(num+" is a Perfect Number");
        }else{
            System.out.println(num+" is not a Perfect number");
        }
    }
}
