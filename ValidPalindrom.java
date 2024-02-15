package Stringss;

public class ValidPalindrom {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(isPalindrome(s));
        
    }
    static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
           char[] ch=s.toCharArray();
           int s1=0;
           int e=s.length()-1;
           while(s1<=e){
               
                   if(ch[s1]!=ch[e]){
                       return false;
                   }
                   else{
                       s1++;
                       e--;
                   }
               
           }
           return true;
       }
    
}
