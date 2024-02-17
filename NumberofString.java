package Stringss;
//1967. Number of Strings That Appear as Substrings in Word
public class NumberofString {
    public static void main(String[] args) {
        String[] pattern={"a","b","c"};
        String word="aaaaabbbbb";
        int i=0;
        int count =0;
        while (i<pattern.length) {
           if( word.contains(pattern[i])){
            count++;
           }
           i++;
        }
        System.out.println(count);
    }
    
}
