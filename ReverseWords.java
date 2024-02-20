package Stringss;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s="a good   example";
       String[] s1=s.split(" ");
       StringBuilder sb=new StringBuilder();
       //System.out.println(Arrays.toString(s1));
       for(int i=s1.length-1;i>=0;i--){
    
        sb.append(s1[i]).append("");
 
        if (i > 0 && !s1[i].isEmpty()) {
            
            sb.append(" "); // Append space if it's not the last word
        }
        

       }
       sb.reverse();
       String str=sb.toString().trim();
       System.out.println(str);

       
    // int sttart=0;
    
    // int n=s1.length;
    // int end=n-1;
    // while (sttart<end) {
    //     String temp=s1[sttart];
    //     s1[sttart]=s1[end];
    //     s1[end]=temp;
    //     sttart++;
    //     end--;


        
    // }
    // System.out.println(Arrays.toString(s1));
    }
}
