package Bitwise_manupulation;
//(6)10=1
//(6)2=110=3 digit
public class Findnosinbaseb {
    public static void main(String[] args) {
        int n=9;
        // int count=0;
        // while(n>0){
        //     count++;
        //     n=n>>1;
        // }
        // System.out.println(count); 
        //----2nd method
        int b=8;
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
    
    
}
