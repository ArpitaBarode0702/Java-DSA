package Recursion;

public class ReverseString {

public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'};
    int e=s.length-1;
   reverseString(s, 0, e);
   System.out.println(s);
  
}

    public static void reverseString(char[] s,int start,int end) {
        if(start>end){
            return;
        }
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        reverseString(s, start+1, end-1);
    }
    
}
