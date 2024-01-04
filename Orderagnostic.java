//when you don't know that the array is sorted in assending or dessending order then apply this code
public class Orderagnostic {
    public static void main(String[] args) {
        //int[] num={-18,12,14,26,48,50,51,52};
        int[] num={52,45,35,25,15,-10};
        int target=45;
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
        return -1;


    }
}
