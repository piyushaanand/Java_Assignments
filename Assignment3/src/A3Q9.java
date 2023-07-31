import java.util.Scanner;
public class A3Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int lar=0,slar=0;
        if(a>b&&a>c){
             lar = a;

        }else if(b>a&&b>c){
            lar = b;
        }else if(c>b&&c>a) {
          lar=c;
        }
        if((a>b&&c>a)||(b>a&&a>c)){
          slar = a;
        }else if((b>a&&c>b)||(a>b&&b>c)){
            slar=b;
        }else{
          slar=c;
        }
        System.out.println("Largest num = "+lar);
        System.out.println("Second largest num = "+slar);
    }
}
