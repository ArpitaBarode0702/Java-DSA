//search in sorted 2d matrix

import java.util.Arrays;

public class RowColMat2D {
    public static void main(String[] args) {
        int[][] mat={{10,20,30,40},{15,25,35,45},{28,29,37,49},{
            33,34,38,50
        }
        };
        int target=39;
        int[] ans=search(mat, target);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] search(int[][] mat,int target){
        int r=0;
        int c=mat.length-1;
        while (r<mat.length && c>=0) {
            if(mat[r][c]==target){
                return new int[]{r,c};
            }
            else if (mat[r][c]<target) {
                r++;
                
            }
            else{
                c--;
            }
            
        }
        return new int[]{-1,-1};
    }

    
}
