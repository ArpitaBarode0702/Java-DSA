package Recursion;

import Patterns.second;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,4,6,80};
        int target=80;
        System.out.println(search(arr, 0, target));
        System.out.println(search2(arr, 0, target));
    }
    public static int search(int[] arr,int index,int target){
        if(index==arr.length){
            return 0;
        }
        else if(arr[index]==target ){
            return index;
        }
        else{
           return search(arr, index+1, target);
            
        }
    }
    public static boolean search2(int[] arr,int index,int target){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search2(arr, index+1, target);
    }
}
