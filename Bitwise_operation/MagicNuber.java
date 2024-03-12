package Bitwise_manupulation;
//find 5th magic number
//1st=001=0*5 power 3+0*5 power 2+1*5 power 1
//5 th magic number=binary 5=101=1*5 pow 3+0*5 power 2+1*5 power 1=130
public class MagicNuber {
    public static void main(String[] args) {
        int n=2;
        System.out.println(magicnum(n));
    }
    public static int magicnum(int n){
        int base=5;
        int ans=0;
        while(n>0){
            int last=n&1;
            ans=ans+last*base;
            n=n>>1;
            base=base*5;

        }
        return ans;
    }
}
