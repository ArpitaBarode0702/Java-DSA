import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] nums) {
      
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
            if(  nums[i]!=nums[c]){
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
                 return new int[] {nums[j],j+1};
            }
        }
         return new int[] {-1,-1};
    }

    
}
