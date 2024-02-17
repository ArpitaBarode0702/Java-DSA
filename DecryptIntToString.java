package Stringss;
//Decrypt String from Alphabet to Integer Mapping
public class DecryptIntToString {
    public static void main(String[] args) {
        String s="10#11#12";
        System.out.println(decrypt(s));
        
    }
    static String decrypt(String s){
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int i=0;
        while(i<n){
            if(i+2<n && s.charAt(i+2)=='#'){
                String sub=s.substring(i, i+2);//'10'
                int num=Integer.parseInt(sub);//10
                char ch=(char)(num+96);//106-'j';
                sb.append(ch);
                i=i+3;
            }
            else{
                char ch=s.charAt(i);
                sb.append((char)(ch+48));//a
                i++;
            }
        }
        return sb.toString();
    }
}
