class Solution {
   public void rotate(int[][] matrix) {
       int n = matrix.length;
       //transpose
       for(int i = 0; i<n; i++){
           for(int j =i; j<n; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
       
       //reverse rows
       int m =0;
       while(m<n){
           int i = 0;
           int j = n-1;
           while(i<j){
               int temp = matrix[m][i];
               matrix[m][i] = matrix[m][j];
               matrix[m][j] = temp;
               i++;
               j--;
           }
           m++;
       }
       
       
    }

}
