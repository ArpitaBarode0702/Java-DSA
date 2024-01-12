//celling of number is : the number that is smallest1 number that is greater or equal to target
public class CellingOfNumber {
    public static void main(String[] args) {
        // int[] num={2,3,5,9,14,16,18};
        int[] num = { 2, 6, 8, 11, 34, 36, 45, 50 };
        int target = 15;
        int ans = orderagnosticbinarysearch(num, target);
        System.out.println(ans);

    }

    static int orderagnosticbinarysearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        // find whether the array is in ascending or descending
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
                } else {
                    start = mid + 1;

                }
            }
            else {
                if (target > num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return num[start];

    }
}
