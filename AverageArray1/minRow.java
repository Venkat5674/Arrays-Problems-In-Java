class Solution {
    int minRow(int mat[][]) {
        // code here
    int n = mat.length;
    int m = mat[0].length;
    
    int minOnes = Integer.MAX_VALUE;
    int minIndex = -1;
    
    for(int i = 0; i < n; i++){
        int count = 0;
        for(int j = 0; j < m; j++){
            if(mat[i][j] == 1){
                count++;
            }
        }
        
        if(count < minOnes){
            minOnes = count;
            minIndex = i + 1;
        }
     }
     return minIndex;
        
    }
}
