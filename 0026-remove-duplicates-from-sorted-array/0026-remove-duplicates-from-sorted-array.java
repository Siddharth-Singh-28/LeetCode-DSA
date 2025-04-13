class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int pointer1 = 0;
        int pointer2 = 1;
        while(pointer2 < nums.length){
            if(nums[pointer1] != nums[pointer2]){
                pointer1++;
                nums[pointer1] = nums[pointer2];
                k++;
            }
            pointer2++;
        }
        return k;
    }
}