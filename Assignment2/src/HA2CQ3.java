public class HA2CQ3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int sum = a/1000 + a%10;
        int Sum = (a/100)%10 + (a/10)%10;
        System.out.println("Sum of first and last digit = "+sum+" and sum of second and third digit = "+Sum);
    }
}
