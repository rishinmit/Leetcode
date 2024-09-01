import java.util.*;
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length;
        int [][] matrix = new int[m][n];
        int i,j, index=0;
        if(size!=m*n){
            return new int[0][0];
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matrix[i][j] = original[index];
                index++;
            }
        }
        return matrix;
     }
}