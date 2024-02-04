//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALlDuplicate {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println((findDuplicates(arr)));
        
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        ArrayList<Integer> l=new  ArrayList<>();
        while(i<nums.length){
            
                int c=nums[i]-1;
                if(nums[i]!=nums[c]){
                    int temp=nums[i];
                    nums[i]=nums[c];
                    nums[c]=temp;
                }
                else{
                i++;
                }
        }
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                l.add(nums[j]);
            }
        }
        return l;
        
    }
    
}
