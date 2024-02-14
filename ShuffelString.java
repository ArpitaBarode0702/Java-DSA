package Stringss;

public class ShuffelString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(shuffel(s, indices));
        
    }
    static String shuffel(String str,int[] indices){
        char[] ans=new char[str.length()];
        for(int i=0;i<str.length();i++){
            int targetInd=indices[i];
            ans[targetInd]=str.charAt(i);
        }
      return String.valueOf(ans);//for returning the character array into string
    }
}
