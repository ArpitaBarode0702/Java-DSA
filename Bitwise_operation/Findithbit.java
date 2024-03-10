package Bitwise_manupulation;

// Find ith bit of a number
public class Findithbit {
    public static void main(String[] args) {
        int n = 7;
        int i = 3;
        System.out.println(bit(n, i));
    }

    public static int bit(int n, int i) {
        return (n & (1 << (i - 1))) != 0 ? 1 : 0;
    }
}
