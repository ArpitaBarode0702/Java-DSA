public class binarysearch {
    public static void main(String[] args) {
        int[] num={-18,12,14,26,48,50,51,52};
        int ans=binary1(num,12);
        System.out.println("lement is present at"+ans);

    }
    //return the index
    // we will return -1 if rhe element is not prssent in the array
    static int binary1(int[] num,int target) {
        int start = 0;
        int end = num.length - 1;
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

