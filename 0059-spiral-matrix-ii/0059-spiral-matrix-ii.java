class Solution {
    public int[][] generateMatrix(int n) {
        int result[][] = new int[n][n];
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;
        int num = 1;
        while(startRow<=endRow && startCol <= endCol)
        {
            for(int j=startCol; j<=endCol; j++)
            {
                result[startRow][j] = num;
                num++;
            }
            for(int i=startRow+1; i<=endRow; i++)
            {
                result[i][endCol] = num;
                num++;
            }
            if(startRow<endRow)
            {
                for(int j=endCol-1; j>=startCol; j--)
                {
                   result[endRow][j] = num;
                   num++;
                }
            }
            if(startCol < endCol)
            {
                for(int i=endRow-1; i>=startRow+1; i--)
                {
                    result[i][startCol] = num;
                    num++;
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }
}