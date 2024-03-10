package Bitwise_manupulation;

public class Setithbit {
    public static void main(String[] args) {
        int n=8;
        int i=3;
        System.out.println(setbit(n,i));
    }

    private static int  setbit(int n, int i) {
        return (n | (1<<(i-1)));
        
    }
    
}
