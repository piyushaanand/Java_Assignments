public class HA2CQ2 {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        double S_A= Math.PI*Math.pow(r,2) + 2*Math.PI*r*h;
        System.out.println(S_A);
    }
}
