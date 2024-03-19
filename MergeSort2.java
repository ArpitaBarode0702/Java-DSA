import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,3};
        ;
        mergesort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> l=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                l.add(arr[left]);
                left++;
            }
            else{
                l.add(arr[right]);
                right++;
            }
        }
        //if any element is exist in b/w anyone of left or right
        while (left<=mid) {
            l.add(arr[left]);
            left++;
            
        }
        while (right<=high) {
            l.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=l.get(i-low);
        }
    }
    
}
