class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        int[][] result = new int[nums.length/3][3];
        for(int i=0; i<nums.length/3; i++){
            for(int j=0; j<3; j++){
                if(j==0){
                    if(Math.abs(nums[index]-nums[index+1]) <=k && Math.abs(nums[index]-nums[index+2]) <=k){
                        result[i][j] = nums[index];
                        index++;
                    }
                    else{
                        return new int[0][0];
                    }
                }
                else if(j==1){
                    if(Math.abs(nums[index]-nums[index-1]) <=k && Math.abs(nums[index]-nums[index+1]) <=k){
                        result[i][j] = nums[index];
                        index++;
                    }
                    else{
                        return new int[0][0];
                    }
                }
                else{
                    if(Math.abs(nums[index]-nums[index-1]) <=k && Math.abs(nums[index]-nums[index-2]) <=k){
                        result[i][j] = nums[index];
                        index++;
                    }
                    else{
                        return new int[0][0];
                    }
                }
            }
        }
        return result;
    }
}