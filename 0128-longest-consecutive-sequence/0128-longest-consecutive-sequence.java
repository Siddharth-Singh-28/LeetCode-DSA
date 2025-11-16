class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int maxCount = 0, count = 1;
        Arrays.sort(nums); 
        
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == last) {
                count++;
                last = nums[i];
            } else if (nums[i] != last) { 
                count = 1;
                last = nums[i];
            }
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}