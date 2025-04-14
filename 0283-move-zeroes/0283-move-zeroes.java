class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i + 1;
        while(i<nums.length-1){
            if(nums[i]==0 && nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j = i + 1;
                continue;
            }
            if(j==nums.length-1){
                j=i+1;
                i++;
            }
            else{
                j++;
            }
        }
    }
}