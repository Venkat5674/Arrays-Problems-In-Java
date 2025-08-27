class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        if(mat == null || mat.length == 0 || mat[0].length == 0){
            return new int[0];
        }
        int n = mat.length;
        int m = mat[0].length;
        
        int [] result = new int[m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[j] += mat[i][j];
            }
        }
        return result;
    }
}
