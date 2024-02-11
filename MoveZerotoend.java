// Given an array arr[] of n positive integers. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in-place.

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerotoend {
   public static void main(String[] args) {
    int[] nums={1,0,0,0};
    
    move(nums);
    System.out.println(Arrays.toString(nums));
    move2(nums);
    System.out.println(Arrays.toString(nums));
   } 
   //brute force approach
   static void move(int[] nums){
    ArrayList<Integer> l=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            l.add(nums[i]);
        }
    }
    int n=l.size();
    for(int i=0;i<n;i++){
        nums[i]=l.get(i);
    }
    for(int i=n;i<nums.length;i++){
        nums[i]=0;
    }
    
   }
   //optimal solution-two pointers
   static void move2(int[] nums){
    int j=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            j=i;
            break;
        }
    }
    if(j!=-1){
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
   }
}
