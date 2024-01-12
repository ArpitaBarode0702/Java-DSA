//Amazon Question -Find Position of an element in a sorted array of infinite numbers.
public class Infinitesortedarray {
    public static void main(String[] args) {
        int[] num={3,5,7,9,10,90,100,130,140,16,170};
        int target=10;
        int ans=newinfinite(num,target);
        System.out.println(ans);

    }
    static int newinfinite(int[] num,int target){
       //first find the range
       // first start with the box of size 2
        int start=0;
        int end=1;
        //condition to target to lie int the range
        while (target>num[end]){
            int newstart=end+1;
             end=(end-start+1)*2;
             start=newstart;

        }
        return binary1(num,target,start,end);
    }
    static int binary1(int[] num,int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid])//the element is lie at left side of mid{

            {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;
    }
}
