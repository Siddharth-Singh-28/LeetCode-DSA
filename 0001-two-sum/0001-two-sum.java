class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hmap.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int substract = target - nums[i];
            if(hmap.containsKey(substract) && hmap.get(substract) != i){
                return new int[]{i,hmap.get(substract)};
            }
        }
        return new int[]{};
    }
}