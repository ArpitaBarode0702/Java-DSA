package oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box b1=new Box();
        // System.out.println(b1.d);
        // System.out.println(b1.l);
        // System.out.println(b1.w);
        // Boxweight b2=new Boxweight();
        // System.out.println(b2.weight);
        Boxweight b3=new Boxweight(3,4,6,7);
        System.out.println(b3.l);
        System.out.println(b3.d);
        System.out.println(b3.w);
        System.out.println(b3.weight);
    }
}
