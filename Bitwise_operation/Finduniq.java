package Bitwise_manupulation;

public class Finduniq {
    public static void main(String[] args) {
        int arr[]={2,3,5,2,3,5,6};
        System.out.println(uniq(arr));
    }

    private static int uniq(int[] arr) {
        int uni=0;
        for (int i : arr) {
            uni^=i;
        }
        return uni;
    }

    
}
