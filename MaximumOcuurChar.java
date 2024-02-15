package Stringss;

public class MaximumOcuurChar {
    public static void main(String[] args) {
        String s="test";
        System.out.println(maxchar(s));
        
    }
    static char maxchar(String s){
        int[] alpha=new int[26];
        int number=0;
        //in alphabet array we put the count of character
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          number=ch-'a';
          alpha[number]++;


        }
        int max=-1;
        int ans=0;
        for(int i=0;i<26;i++){
            if(max<alpha[i]){
                ans=i;
                max=alpha[i];
            }
        }
        return (char) ((char)'a'+ans);
    }
}
