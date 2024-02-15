package Stringss;

public class ReplaceSpace {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
         String string="I Am Arpita";
         for(int i=0;i<string.length();i++){
            str.append(string.charAt(i));
         }
     System.out.println(replaceSpaces(str));
        
    }
    public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		String s=str.toString();
		s=s.replace(" ", "@40");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
          sb.append(s.charAt(i));
		}
		return sb;
	}
    
}
