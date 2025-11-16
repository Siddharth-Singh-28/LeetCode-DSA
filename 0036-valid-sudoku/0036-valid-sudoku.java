class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if(c == '.') continue;
                int num = c - '0' - 1;
                int boxIndex = i/3*3+j/3;
                if(row[i][num] || column[j][num] || box[boxIndex][num]){
                    return false;
                }
                row[i][num] = true;
                column[j][num] = true;
                box[boxIndex][num] = true;
            }
        }
        return true;
    }
}