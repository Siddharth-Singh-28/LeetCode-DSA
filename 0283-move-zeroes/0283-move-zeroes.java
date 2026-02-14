class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        int b = 1;
        while (a < nums.length && b < nums.length) {
            if(nums[a] == 0 && nums[b] != 0) {
                nums[a] = nums[b];
                nums[b] = 0;
                a++;
                b++;
            }
            else {
                a++;
                b++;
            }
        }
    }
}