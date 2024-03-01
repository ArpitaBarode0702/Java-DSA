package Recursion;

public class Palindrom {
    public static void main(String[] args) {
       System.out.println(palindrom(121));
        
    }
    static int sum=0;
    //recursion
        static void revere(int n){
            if(n==0){
                return;
            }
            int rem=n%10;
            sum=sum*10+rem;
            revere(n/10);
        }

        static boolean palindrom(int n){
            revere(n);
            return n==sum;
        }
    
}
