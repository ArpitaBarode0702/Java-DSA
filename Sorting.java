import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={9,8,3,7,6,2};
        int[] arr2={45,68,23,14,5,-1};
        int[] arr3={5,4,1,3,2,1,};
        System.out.println("Bubble sort:");
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("selection sort:");
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Insertion sort:");
        insertionsort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Cyclic sort:");
        cyclicsort(arr3);
        System.out.println(Arrays.toString(arr3));
        repeat(arr3);

    }
    static void cyclicsort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

    }
    static int repeat(int[] arr){
        System.out.println("repeated elemen  ");
        for(int j=1;j<arr.length-1;j++){
            if(arr[j]==arr[j+1]){
                return arr[j+1];
            }
        }
        return -1;
    }
    static void insertionsort(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void selectionsort(int[] arr){
        for (int i=0;i<arr.length;i++){
            //find the max element in the remaining array and swap with correct index
            int last=arr.length-i-1;
            int maxIndex=getmax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getmax(int[] arr,int start,int end){
        int max=start;
        for (int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;

    }
    static void bubblesort(int[] arr){
        boolean swape;
        //rn the steps n-1 time
        for(int i=0;i<arr.length;i++){
            swape=false;

            //for each step max item will come at the last respective index
            for (int j=1;j<arr.length-i;j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swape = true;

                }
            }
                if (!swape){//true
                    break;
                }

            }
        }
    }

