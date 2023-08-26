public class StringRevese {
    public static void main(String[] args) {
    String st="Hello";
    reverse(st);

}
    public static String reverse( String str){
        StringBuilder sb=new StringBuilder();
        int n=str.length();
        for (int i=n;i>=0;i--){
            sb.append(i);
        }
        String str2=sb.toString();
        return str2;
    }
}