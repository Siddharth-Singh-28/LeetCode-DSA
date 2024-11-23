class Solution {
    public void sortColors(int[] nums) {
        int n = 0;
        while(n<nums.length-1)
        {
            for(int i=0; i<(nums.length-1)-n; i++)
            {
                if(nums[i] > nums[i+1])
                {
                    nums[i] = nums[i] + nums[i+1];
                    nums[i+1] = nums[i] - nums[i+1];
                    nums[i] = nums[i] - nums[i+1];
                }
            }
            n++;
        }
    }
}