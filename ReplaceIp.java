package Stringss;

public class ReplaceIp {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(replacedot(address));
        
    }
     static String replacedot(String address){
        address=address.replace(".", "[.]");
        return address;
     }
}
