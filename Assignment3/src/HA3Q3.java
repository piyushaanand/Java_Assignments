
public class HA3Q3 {
    public static void main(String[] args) {
        int a = (int)(1+Math.random()*(12-1+1));
        String b = " ";
        switch (a){
            case 1 : b =" January ";break;
            case 2 : b =" February ";break;
            case 3 : b =" March ";break;
            case 4 : b =" April ";break;
            case 5 : b =" May ";break;
            case 6 : b =" June ";break;
            case 7 : b =" July ";break;
            case 8 : b =" August ";break;
            case 9 : b =" September ";break;
            case 10 :b=" October ";break;
            case 11 :b=" November ";break;
            case 12 :b=" December ";break;
        }
        System.out.println(a+" is "+b);
    }
}
