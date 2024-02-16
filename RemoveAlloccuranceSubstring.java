package Stringss;

public class RemoveAlloccuranceSubstring {
    public static void main(String[] args) {
        String name ="daabcbaabcbc";
        String part="abc";
        while(name.contains(part)){
            name=name.replaceFirst(part,"");
        }
        System.out.println(name);
    }
    
}
