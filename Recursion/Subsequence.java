package Recursion;
//we have to find the subset of string
public class Subsequence {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        subseq(p, up);
    }
    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    
}
