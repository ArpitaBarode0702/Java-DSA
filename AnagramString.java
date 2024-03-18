package Stringss;

import java.util.Arrays;

//two string are anagram if we change the order of character of one string to formed other word
public class AnagramString {
    public static void main(String[] args) {
        String s1="abc";
        String s2="cab";
        System.out.println(isanagram(s1, s2));
        
    }
    public static boolean isanagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] ch1=s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}
