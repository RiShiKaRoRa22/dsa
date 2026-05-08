class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board,0,0);
        //base case


        

        
    }
    public boolean backtrack(char[][] board,int i, int j ){
        
        for(int ii=0;ii<board.length;ii++){
            for(int jj=0;jj<board[0].length;jj++){
                if(board[ii][jj]=='.'){
                    for(int ind=0;ind<9;ind++){
                        char num=(char)(ind+'1');
                        board[ii][jj]=num;
                        if(isValid(board,ii,jj,num)){
                            if(backtrack(board,ii,jj)){
                                return true;
                            }
                        }
                        board[ii][jj]='.';  
                    }
                    return false;     
                }    
            }
        }
    return true;
    }

    public boolean isValid(char[][] board, int i, int j, char num){
        //check for cols
        for(int ii=0;ii<9;ii++){
                if(ii!=i && board[ii][j]==num){
                    return false;
                }
        }

        //check for row
        for(int jj=0;jj<9;jj++){
                if(jj!=j && board[i][jj]==num){
                    return false;

                }

        }
            

        //check for mini 3x3 box
        int startrow=(i/3)*3;
        int startcol= (j/3)*3;
        for(int si=startrow;si<startrow+3;si++){
            for(int sj=startcol;sj<startcol+3;sj++){
                if((si!=i || sj!=j )&& board[si][sj]==num){
                    return false;
                }

            }
        }
        return true;
    }
    
}