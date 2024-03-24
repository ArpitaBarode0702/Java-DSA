package Recursion;

public class SkipString {
    public static void main(String[] args) {
        String p="";
        String up="bacaappled";
     
      skip(p, up);
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.startsWith("apple")){
            skip(p, up.substring(5));
        }
        else{
            skip(p+up.charAt(0), up.substring(1));
        }
    }
    
}
