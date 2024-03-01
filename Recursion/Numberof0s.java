package Recursion;

public class Numberof0s {
    public static void main(String[] args) {
        System.out.println(nozero(20002));
        nozero1(300030);
        System.out.println(c);
    }

    // iterative
    static int nozero(int n) {
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    // recursive
    static int c=0;
    static void nozero1(int n) {
        if (n == 0) {
            return ;
        }
        int rem=n%10;
        if (rem==0) {
           c++; 
        }
        nozero1(n/10);
    }

}
