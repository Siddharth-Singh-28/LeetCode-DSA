class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct  = nums[i] - 1;
            if( nums[i] != 0 && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;    
            }
        }
        int index=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==0){
                index = j+1;
                break;
            }
        }
        return index;
    }
}