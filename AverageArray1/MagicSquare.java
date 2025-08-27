class Solution {
    public static String magicSquare(int mat[][]) {
        // Code here
        int n = mat.length;
        
        for(int i = 0; i < n; i++){
            if(mat[i].length != n){
                return "Not a Magic Square";
            }
        }
        
        boolean [] present = new boolean[n*n + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int num = mat[i][j];
                if(num < 1 || num > n*n || present[num]){
                    return "Not a Magic Square";
                }
                present[num] = true;
            }
        }
        
        int magicSum = 0;
        for(int j = 0; j < n; j++){
            magicSum += mat[0][j];
        }
        
        for(int i = 1; i < n; i++){
            int rowSum = 0;
            for(int j = 0; j < n; j++){
                rowSum += mat[i][j];
            }
            if(rowSum != magicSum){
                return "Not a Magic Square";
            }
        }
        
        for(int j = 0; j < n; j++){
            int colSum = 0;
            for(int i = 0; i < n; i++){
                colSum += mat[i][j];
            }
            if(colSum != magicSum){
                return "Not a Magic Square";
            }
        }
        
        int mainDiagSum = 0;
        for(int i = 0; i < n; i++){
            mainDiagSum += mat[i][i];
        }
        if(mainDiagSum != magicSum){
            return "Not a Magic Square";
        }
        
        
        int otherDiagSum = 0;
        for(int i = 0; i < n; i++){
            otherDiagSum += mat[i][n-1-i];
        }
        if(otherDiagSum != magicSum){
            return "Not a Magic Square";
        }
        
        return "Magic Square";
        
    }
}
