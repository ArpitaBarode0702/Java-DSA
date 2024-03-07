import java.util.Scanner;
public class sumarray {
    public static void main(String[] args) {
        int[] arr={1,4,6,7,8};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }

}
