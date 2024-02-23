package Recursion;
//print 1to n without loop
public class PrintonetoN {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        //base con
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        
    }
    
}
