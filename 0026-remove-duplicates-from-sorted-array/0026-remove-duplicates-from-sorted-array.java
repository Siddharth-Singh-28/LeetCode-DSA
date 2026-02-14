class Solution {
    public int removeDuplicates(int[] nums) {
        int count  = 1;
        int a  = 0;
        int b = 1;
        while(a < nums.length && b < nums.length) {
            if(nums[a] == nums[b]) {
                b++;
            }
            else {
                count++;
                a++;
                nums[a] = nums[b];
                b++;
            }
        }
        return count;
    }
}