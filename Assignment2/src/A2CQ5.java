public class A2CQ5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int x = Math.max(a,Math.max(b,c));
        int y = Math.min(a,Math.min(b,c));
        int m = (a+b+c)-(x+y);
        System.out.println("min middle max - "+y+" "+m+" "+x);
    }
}
