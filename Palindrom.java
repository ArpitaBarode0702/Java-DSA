package Stringss;

 /**
  * InnerPalindrom
  */
  class InnerPalindrom {
   public boolean ispalindrom(String str){
    if(str==null || str.length()==0){
        return true;
    }
    for(int i=0;i<str.length()/2;i++){
     int start=str.charAt(i);
     int end=str.charAt(str.length()-1-i);
     if(start!=end){
        return false;
     }
    }
    return true;
    
   }
    public boolean ispalindrom2(String str){
        String name1="";
        for(int i=str.length()-1;i>0;i--){
            name1+=str.charAt(i);

        }
        if(str.equals(name1)){
            return true;
        }
        return false;
    }
    
 }
public class Palindrom {
public static void main(String[] args) {
    String name="abcdcb";
    InnerPalindrom i=new InnerPalindrom();
    System.out.println(i.ispalindrom(name));
    System.out.print(i.ispalindrom2(name));
    
}

}
