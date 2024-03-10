package Bitwise_manupulation;
public class Numberisodd {
    public static void main(String[] args) {
        int n=3;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
        // TODO Auto-generated method stub
       return (n&1)==1;
    }
    
}
