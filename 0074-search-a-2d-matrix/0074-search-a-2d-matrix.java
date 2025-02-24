class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        while(start <= end){
            int mid_index = start + (end - start)/2;
            int row_index = mid_index / n;
            int col_index = mid_index % n;
            int mid_element = matrix[row_index][col_index];
            if(target == mid_element){
                return true;
            }
            else{
                if(mid_element < target){
                    start = mid_index + 1;
                }
                else{
                    end = mid_index - 1;
                }
            }
        }
        return false;
    }
}