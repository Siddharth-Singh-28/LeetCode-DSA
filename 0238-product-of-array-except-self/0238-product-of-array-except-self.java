class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;
        for(int i=1; i<n; i++){
            int multiplier = prefix[i-1];
            prefix[i] = multiplier * nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            int multiplier = suffix[i+1];
            suffix[i] = multiplier * nums[i+1];
        }
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}