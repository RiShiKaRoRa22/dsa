class Solution {
    public void setZeroes(int[][] matrix) {
        int rows= matrix.length;
        int cols= matrix[0].length;

        int[][] newmatrix= new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                newmatrix[i][j]=matrix[i][j];
            }
        }
        


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(newmatrix[i][j]==0){
                    int r=i;
                    int c=j;
                    for(int a=0;a<cols;a++){
                        matrix[r][a]=0;
                    }
                    for(int a=0;a<rows;a++){
                        matrix[a][c]=0;
                    }
                }
            }
        }
        
    }


}