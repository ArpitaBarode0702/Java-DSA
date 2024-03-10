package Recursion;

public class Capitalfinding {
    public static void main(String[] args) {
        String s="geekS";
        char[] s1=s.toCharArray();
        // System.out.println(s1[0]);
        // for (char c : s1) {
        //     System.out.println(c);
        // }        

        System.out.println(searchcap(s1, 0));
    }
    public static char searchcap(char[] s1,int index){
        if(index==s1.length){
            return '0';
        }
        char ch=s1[index];
        if(Character.isUpperCase(ch)){
            return ch;
        }
       return searchcap(s1, index+1);
    }
}
