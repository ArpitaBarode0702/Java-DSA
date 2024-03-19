//Merge sort:-merge sort is defined as a sorting algo that works by dividing an array into subrrrays and then sort each of the subarrays and merge back together to form orignnal sorted array

import java.util.Arrays;

public class MergeSort {
    
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] ans=mergesorting(arr);
        System.out.println(Arrays.toString(ans));
        //System.out.println(Arrays.toString(arr));//orignal array was not changed

    }
    public static int[] mergesorting(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesorting(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesorting(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second) {
        // TODO Auto-generated method stub
        int[] mix=new int[first.length+second.length];
        int i=0;int j=0;
        int k=0;
        while (i<first.length && j<second.length) {//this loop runs untill one of the arrays becomes empty or we riched till last elemnt
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
            
        }
        //in conditon like if we riched till last of one array but one array have more element then we put those elemnt at the back of mix array
        while(i<first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
   
    }
}
