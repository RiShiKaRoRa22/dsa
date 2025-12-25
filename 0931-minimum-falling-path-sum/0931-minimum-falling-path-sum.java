class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int[][] dup= new int[m][n];
        for(int j=0;j<n;j++){
            dup[0][j]=matrix[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int add=0;
                if(j>=1 && j<m-1){
                    add=minofThree(dup[i-1][j],dup[i-1][j-1],dup[i-1][j+1]);
                }
                else if(j==0){
                    add= minofThree(dup[i-1][j],Integer.MAX_VALUE,dup[i-1][j+1]);

                }
                else{
                    add= minofThree(dup[i-1][j],Integer.MAX_VALUE,dup[i-1][j-1]);
                }

                dup[i][j]=matrix[i][j]+add;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min= Math.min(dup[m-1][j],min);
        }
        return min;
    }
    public int minofThree(int a, int b, int c){
        if(a<b){
            if(a<c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b<c){
                return b;
            }
            else{
                return c;
            }    
        }
    }
}