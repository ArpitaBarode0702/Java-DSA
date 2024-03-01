package Recursion;
public class ReverseNumber {
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

//iteraive
static int rev1(int n){
    int sum=0;
    while(n!=0){
       int rem=n%10;
       sum=sum*10+rem;
       n=n/10;

    }
    return sum;
}    

    public static void main(String[] args) {
        //System.out.println(revere(1234));
       // revere(1234);
        //System.out.println(sum);
        System.out.println(rev1(1234));
        
    }

}