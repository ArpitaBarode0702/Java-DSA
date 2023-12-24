import java.util.Scanner;
public class armstron2 {
    public static void main(String[] args) {
        boolean ans=arms();
        System.out.println(ans);
    }
    static boolean arms(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num= sc.nextInt();
        int orignal=num;
        int sum=0;
        while (num>0){
            int rem=num%10;
            int cube=rem*rem*rem;
            sum=sum+cube;
            num=num/10;
        }
        if(sum==orignal){
            return true;
        }
        return false;
    }
}
