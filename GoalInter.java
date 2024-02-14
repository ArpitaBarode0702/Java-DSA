package Stringss;

public class GoalInter {
    public static void main(String[] args) {
        String name="G()(al)";
        System.out.println(interpret(name));
        System.out.println(inter(name));
        
    }
    //1 -method
    static String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int n=command.length();
        for(int i=0;i<n;i++){
            if(command.charAt(i)=='G'){
                sb.append("G");

            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                sb.append("al");
                i+=3;
            }
        }
        String str=sb.toString();
        return str;
        
    }
    // 2nd 
    static String inter(String str){
        str=str.replace("()","o");
        str=str.replace("(al)", "al");
        return str.toString();
    }
}
