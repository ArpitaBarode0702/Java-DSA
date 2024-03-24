package Recursion;

import Patterns.second;

public class PrintASCII {
    public static void main(String[] args) {
       String p="";
       String up="abc";
       printacii(p, up);
    }
    public static void printacii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        printacii(p+ch, up.substring(1));
        printacii(p, up.substring(1));
        printacii(p+(ch+0), up.substring(1));
    }
    
}
