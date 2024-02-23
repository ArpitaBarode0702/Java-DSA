package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int ans=sum(1342);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==0){
            return n;
        }
        int rem=n%10;
        int div=n/10;
        return rem+sum(div);
    }
    
}
