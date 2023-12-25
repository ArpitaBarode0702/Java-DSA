import java.util.Arrays;

public class MinimuMaximum {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
    }
    static void swap(int[] arr,int index1,int idex2){
        int tamp=arr[index1];
        arr[index1]=arr[idex2];
        arr[idex2]=tamp;
    }
    static int maximum(int[] arr){
       int max=arr[0];
       for (int i=0;i<arr.length;i++){
           if(max<arr[i]){
               max=arr[i];
           }
       }
        return max;
    }
    static int minimum(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
