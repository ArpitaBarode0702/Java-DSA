public class Numberofgoodpairs {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        int ans=numIdenticalPairs(nums);
        System.out.println(ans);
    }
    static int numIdenticalPairs(int[] nums){
        int n=nums.length;
        int count=0;
        //int[] arr=new int[n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;

                }
            }

        }
        return count;

    }
}
