import java.util.Arrays;

public class NintyDegreeArray {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 0 }, { 0, 1 } };
        int[][] temp = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length - 1; i++) {
            
            for ( int j = 0; j < mat[i].length; j++) {
                temp[i][j] = mat[i][j];
                mat[i][j] = mat[i + 1][j];
                mat[i + 1][j] = temp[i][j];
                
            }
        }
            
            
        
            
       
        for (int r = 0; r < mat.length; r++) {
            System.out.println(Arrays.toString(mat[r]));
            if(mat[r]==target[r]){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }

        }

    }

}
