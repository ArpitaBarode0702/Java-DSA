package Recursion;

//you have to print the string without a particuler character
public class SkipChar {
    public static void main(String[] args) {
        String up="baccda";
        String p="";
        skip(p, up);
        
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }
    
}
