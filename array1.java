public class array1 {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        reverse(arr);





    }
    static void reverse(int[] arr){

        for (int index=arr.length-1;index>=0;index--){
            System.out.println(arr[index]);
        }
    }

}
