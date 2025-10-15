import java.util.*;

class Solution {
    List<List<String>> result = new ArrayList<>();
    char[][] board;
    boolean[] col;
    boolean[] diag1;
    boolean[] diag2;

    public List<List<String>> solveNQueens(int n) {
        board = new char[n][n];
        col = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];

        for (int i = 0; i < n; i++) Arrays.fill(board[i], '.');
        backtrack(0, n);
        return result;
    }

    private void backtrack(int row, int n) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) temp.add(new String(r));
            result.add(temp);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (col[c] || diag1[row + c] || diag2[row - c + n]) continue;

            board[row][c] = 'Q';
            col[c] = diag1[row + c] = diag2[row - c + n] = true;

            backtrack(row + 1, n);

            board[row][c] = '.';
            col[c] = diag1[row + c] = diag2[row - c + n] = false;
        }
    }
}
