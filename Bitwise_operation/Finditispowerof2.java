package Bitwise_manupulation;
//you ara given a number ,find out it is power of 2
//a number is power of 2 if it have only one 1 in it binary
public class Finditispowerof2 {
    public static void main(String[] args) {
        int n=32;
        int count=0;
        while(n>0){
            int last=n&1;
            if(last==1){
                count++;
            }
            n=n>>1;
        }
        if(count>1){
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
    
}
