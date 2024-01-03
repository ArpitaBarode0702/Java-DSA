import java.util.Scanner;

public class Linearsearch_java {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 12, 3, 4, };
        int target = 12;
        int ans = search(arr, target);
        System.out.println(ans);
        int ans2 = search2(arr, target);
        System.out.println(ans2);
        String str = "Arpita";
        char target2 = 'r';
        boolean ans3 = search3(str, target2);
        System.out.println(ans3);
        boolean ans4 = search4(str, target2);
        System.out.println(ans4);
        int start=1;
        int end =4;
        ans=search5(arr, target, start, end);
        System.out.println("search in range"+ans);

    }
    //search in range
       static int search5(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                // System.out.println("the element is present at "+arr[i]);
                return index;
            }
            // return -1;
        }
        return -1;

    }

    // by toCharArray method
    static boolean search4(String str, char target2) {
        if (str.length() == 0) {
            return false;
        }
        for (char name : str.toCharArray()) {
            if (name == target2) {
                return true;

            }

        }
        return false;

    }

    static boolean search3(String str, char target2) {
        if (str.length() == 0) {
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target2) {
                // System.out.println("the element is present at "+arr[i]);
                return true;
            }
            // return -1;
        }
        return false;

    }

   //return index of element
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                // System.out.println("the element is present at "+arr[i]);
                return index;
            }
            // return -1;
        }
        return -1;

    }
   //return element
    static int search2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int elem = arr[index];
            if (elem == target) {
                // System.out.println("the element is present at "+arr[i]);
                return elem;
            }
            // return -1;
        }
        return Integer.MAX_VALUE;

    }

}
