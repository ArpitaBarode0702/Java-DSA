package Bitwise_manupulation;

import Patterns.second;

//set bit=1 in binary number
public class Countsetbit {
    public static void main(String[] args) {
        int n=34;
        int count=0;
        while (n>0) {
            int last=n&1;
            if(last==1){
                count++;
            }
            n=n>>1;
            
        }
        System.out.println(count);
    }
    
}
