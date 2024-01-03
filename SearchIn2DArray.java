import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr={
            {2,3,4,67,12},{34,5,6,89,100},
            {3,4,9,7,1}
        };
        int target=10;
        int[] ans=searching(arr, target);
        System.out.println(Arrays.toString(ans));
        int maximumv=max(arr);
        System.out.println(maximumv);
    }
    //searching in 2d array
    static int[] searching(int[][] arr,int target){
       
        
            for(int r=0;r<arr.length;r++){
                for(int c=0;c<arr[r].length;c++){
                    int elem=arr[r][c];
                    if(elem==target){
                        return new int[]{r,c};
                    }
                }
            }
            return new int[]{-1,-1};
        }
    
    static int max(int[][] arr){
        int maxv=Integer.MIN_VALUE;
       
        
            for(int r=0;r<arr.length;r++){
                for(int c=0;c<arr[r].length;c++){
                 
                    if(maxv<arr[r][c]){
                        maxv=arr[r][c];
                        
                    }
                }
            }
            return maxv;
        }
    }


