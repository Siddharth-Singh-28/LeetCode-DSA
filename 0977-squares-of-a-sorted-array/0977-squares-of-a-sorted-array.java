class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        int pointer1 = 0;
        int pointer2 = 0;
        while(pointer1 < nums.length) {
            if(nums[pointer1] < 0) {
                pointer1++;
            }
            else {
                break;
            }
        }
        pointer2 = pointer1 - 1;
        while(pointer2 >= 0 && pointer1 < nums.length) {
            if(Math.pow(nums[pointer2], 2) > Math.pow(nums[pointer1], 2)) {
                result[index++] = (int)Math.pow(nums[pointer1], 2);
                pointer1++;
            }
            else {
                result[index++] = (int)Math.pow(nums[pointer2], 2);
                pointer2--;
            }
        }
        while(pointer2 >= 0) {
            result[index++] = (int)Math.pow(nums[pointer2], 2);
            pointer2--;
        }
        while(pointer1 < nums.length) {
            result[index++] = (int)Math.pow(nums[pointer1], 2);
            pointer1++;
        }
        return result;
    }
}