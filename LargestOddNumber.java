package Stringss;
//You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
public class LargestOddNumber {
    public static void main(String[] args) {
        String str="";
        String s="547";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.getNumericValue(ch)%2!=0){
                str=s.substring(0, i+1);
                break;
            }

        }
        System.out.println(str);
        
        
    }
    
}
