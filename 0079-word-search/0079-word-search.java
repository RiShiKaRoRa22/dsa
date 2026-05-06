class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //if(board[i][j]!='.'){
                     if(backtrack(board, word,i,j,0)){
                        return true;
                    }
                //}
            }
        }
        return false;    
    }

    public boolean backtrack(char[][] b, String word, int i, int j, int index){
        if(index==word.length()){return true;}

        if(i>=b.length || i<0|| j<0||j>=b[0].length ){
            return false;

        }
        if(b[i][j]!=word.charAt(index)){
            return false;
        }
        char temp= b[i][j];
        b[i][j]='.';
        boolean ans= (backtrack(b,word,i+1,j,index+1) || backtrack(b,word,i,j+1,index+1) || backtrack(b,word,i-1,j,index+1) || backtrack(b,word,i,j-1,index+1));

        b[i][j]=temp;
        return ans;





    }
}