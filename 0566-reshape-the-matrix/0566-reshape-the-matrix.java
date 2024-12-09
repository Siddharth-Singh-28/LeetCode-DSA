class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int new_mat[][] = new int[r][c];
        int original_elements = mat.length * mat[0].length;
        int new_elements = r * c;
        if(original_elements != new_elements)
        return mat;
        else
        {
            int row = 0;
            int col = 0;
            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    new_mat[i][j] = mat[row][col];
                    if(col==mat[0].length-1)
                    {
                        col = 0;
                        row++;
                    }
                    else
                    {
                        col++;
                    }
                }
            }
            return new_mat;
        }
    }
}