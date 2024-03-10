package Recursion;

public class LengthofString {
    public static void main(String[] args) {
        String a="Arpita";
     System.out.println(lenstr(a));

    
    }
    public static int lenstr(String s){
    if(s.equals("")){
        return 0;
    }
    return lenstr(s.substring(1))+1;
    
    }
    
}
