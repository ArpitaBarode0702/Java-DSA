import java.util.Arrays;

public class FirstandLastPositon {
    public static void main(String[] args) {
        int[] num={5,7,7,8,8,10};
        int target=8;
        int[] ans=Firstlastpos(num,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Firstlastpos(int[] num, int target) {
        int[] ans = {-1, -1};
        int start=search(num,target,true);
        int end=search(num,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;

        //check for  first occurence if target first
    }
    //this functoin is just return the  index value of target
    static int search(int[] num,int target,boolean findstartIndex) {
        int ans = -1;
        int start = 0;

        int end = num.length - 1;
        while (start <= end) {
            // int mid=(start+end)/2;// might be possible that start+end/2 exceds the range of integer
            //better way to find mid
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                //potential ansswer found
                ans = mid;
                if (findstartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }
            return ans;
        }
    }


