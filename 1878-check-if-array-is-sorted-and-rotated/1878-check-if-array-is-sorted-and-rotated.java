class Solution {
    public boolean check(int[] nums) {
        int peak = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                peak++;
            }
        }
        if(peak==0){
            return true;
        }
        else if(peak==1&&(nums[0]>=nums[nums.length-1])){
            return true;
        }
        else{
            return false;
        }
    }
}