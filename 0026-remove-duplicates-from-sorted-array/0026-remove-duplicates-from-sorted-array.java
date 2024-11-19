class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicate_count = 0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                duplicate_count++;
            }
        }   
        int expectedNums[] = new int[nums.length-duplicate_count];
        expectedNums[0] = nums[0];
        int nums_count = 1;
        int expectedNums_count = 1;
        while(nums_count<nums.length&&expectedNums_count<expectedNums.length)
        {
            if(nums[nums_count]!=nums[nums_count-1])
            {
                expectedNums[expectedNums_count] = nums[nums_count];
                expectedNums_count++;
            }
            nums_count++;
        }
        for(int j=0; j<nums.length-duplicate_count; j++)
        {
            nums[j] = expectedNums[j];
        }
        return (nums.length-duplicate_count);
    }
}