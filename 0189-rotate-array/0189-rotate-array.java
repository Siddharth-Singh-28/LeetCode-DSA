class Solution {
    public void rotate(int[] nums, int k) {
        int pointer1 = 0;
        int pointer2 = nums.length - (k % nums.length);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(pointer2<nums.length){
                arr.add(nums[pointer2]);
                pointer2++;
            }
            else{
                arr.add(nums[pointer1]);
                pointer1++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
    }
}