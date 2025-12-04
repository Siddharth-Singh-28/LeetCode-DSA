class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        if(k==1){
            return 1;
        }
        int count = 1;
        int a = 0;
        int b = 1;
        while(a<k && b<k){
            if(nums[a] == nums[b]){
                b++;
            }
            else{
                count++;
                a++;
                nums[a] = nums[b];
                b++;
            }
        }
        return count;
    }
}