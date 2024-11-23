class Solution {
    public void setZeroes(int[][] matrix) {
        int result[][] = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                result[i][j] = matrix[i][j];
            }
        }
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    for(int change=0; change<matrix[0].length; change++)
                    {
                        result[i][change] = 0;
                    }
                    for(int change=0; change<matrix.length; change++)
                    {
                        result[change][j] = 0;
                    }
                }
            }
        }
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                matrix[i][j] = result[i][j];
            }
        }
    }
}