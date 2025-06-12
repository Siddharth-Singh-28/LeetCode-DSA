class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int result[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1){
                result[i] = (int) Math.abs(nums[i] - nums[0]);
            }
            else{
                result[i] = (int) Math.abs(nums[i] - nums[i+1]);
            }
        }
        int maxDifference = result[0];
        for(int i=1; i<result.length; i++){
            if(result[i] > maxDifference){
                maxDifference = result[i];
            }
        }
        return maxDifference;
    }
}