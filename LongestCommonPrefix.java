package Stringss;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s={"Codingninjas",
           " Coding",
            "Coders", "Codezen"};
        System.out.println(commonPrefix(s));
        
    }
    public static String commonPrefix(String []strs){
        //Write your code here
         String res=strs[0];
        for(int i=1;i<strs.length;i++){
            res=common(res,strs[i]);
            
        }
        if(!res.isEmpty()){
            return res;
        }
       return "-1";  
        
    }
    public static String common(String st1,String st2){
        int n=Math.min(st1.length(),st2.length());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(st1.charAt(i)==st2.charAt(i))
            {
                sb.append(st1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    
}
