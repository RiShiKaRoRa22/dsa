class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans= new int[n][n];
        int left=0;
        int right=n-1;
        int var=1;
        int up=0;
        int down=n-1;
        while(left<=right && up<=down){

        
        for(int i=left;i<=right;i++){
            ans[up][i]=var;
            var++;
        }
        up++;
        for(int i=up;i<=down;i++){
            ans[i][right]=var;
            var++;
        }
        right--;
        for(int i=right;i>=left;i--){
            ans[down][i]=var;
            var++;
        }
        down--;
        for(int i=down;i>=up;i--){
            ans[i][left]=var;
            var++;
        }
        left++;
       
        }
        return ans;



        
    }
}