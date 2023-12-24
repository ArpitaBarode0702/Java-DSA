import java.util.Arrays;
import java.util.Scanner;
public class arr_sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr=input.nextInt();
        int[] arr1=new int[6];
        for(int i=0;i<arr;i++){

           arr1[i]=input.nextInt();
        }
        System.out.print(Arrays.toString(arr1));
        int sum=0;
        for(int i=0;i<arr1.length;i++){

            sum=sum+arr1[i];

        }
        System.out.println(sum);

    }
}
