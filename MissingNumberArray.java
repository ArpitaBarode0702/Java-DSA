//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//in this q number is given from 0-n ,whenever you are given to number in range like 1-n or 0-n aplly cyclic sort
 
public class MissingNumberArray {
    public static void main(String[] args) {
        //int[] arr={3,0,1};
        int[] arr={0,1,2,3};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums ) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length &&nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
        
    }
}
