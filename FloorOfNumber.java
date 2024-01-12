//Floor of number=greatest1 number that is smaller or equal to target
//same thing as binary search ,you have to return end instead of -1 when number is not found
public class FloorOfNumber {
    public static void main(String[] args) {
       // int[] num={2,3,5,9,14,16,18};
        int[] num={18,16,14,9,5,3,2};
        int target=15;
        int ans=orderagnosticbinarysearch(num,target);
        System.out.println(ans);

    }

    static int orderagnosticbinarysearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        //find whether the array is in ascending or descending
        boolean isAac;
        if (num[start] < num[end]) {
            isAac = true;
        } else {
            isAac = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                return mid;
            }
            if (isAac) {
                if (target < num[mid]) {
                    end = mid - 1;
                } else if (target > num[mid]) {
                    start = mid + 1;

                } else {
                    if (target > num[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return end;


    }
}


