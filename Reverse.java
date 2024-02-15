package Stringss;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String name="Arpita";
        System.out.println((reverse(name)));
        //System.out.println(len(name));
    }
    static String reverse(String str){
        char[] ch=str.toCharArray();
        int start=0;
        int end=str.length()-1;
        
        while(start<end){
            int temp =ch[start];
            ch[start]=ch[end];
            ch[end]=(char) temp;
            start++;
            end--;

        }
        return String.valueOf(ch);
        
    }
    // static int len(String str){
    //     char[] ch=str.toCharArray();
    //     int count=0;
    //     for(int i=0;ch[i]!='\0';i++){//'\0' is null where the rray termination is stop
    //       count++;
    //     }
    //     return count;//this code not run becouse java not terminate with null it is aplacable for c/c++
    // }

}
