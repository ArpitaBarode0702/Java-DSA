package Stringss;

public class Stringisrotated {
    public static void main(String[] args) {
        String p = "abac";
        String q = "baca";
      //System.out.println(  isCyclicRotation(p, q));
      System.out.println(iscyclic(p, q));
    }
//method 1
    public static int isCyclicRotation(String p, String q) {
        String p1 = p;
        String p2 = q;
        boolean isequal = false;
        char[] ch1 = p.toCharArray();
        System.out.println(ch1);
        char[] ch2 = new char[ch1.length];
        int k = 1;
        for (int i = 0; i < ch1.length; i++) {
            ch2[i] = ch1[i];
        }
        for (int j = 0; j < ch1.length; j++) {
            char[] temp = new char[ch1.length];
            for (int i = 0; i < ch1.length; i++) {
                temp[(i + k) % ch1.length] = ch2[i];
            }
            String s = String.copyValueOf(temp);
            System.out.println(s);
            if (s.equals(q)) {
                isequal = true;
                break;
            }
            ch2 = temp; // Update ch2 for next rotation
        }
        if (isequal) {
            return 1;
        } else {
            return 0;
        }
    }
    //method 2
    public static boolean iscyclic(String p,String q){
        String whole=p+p;
        if(whole.contains(q)){
            return true;
        }
        else{
            return false;
        }
    }
}
