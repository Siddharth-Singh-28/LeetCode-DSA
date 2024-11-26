class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        for(int i=m; i<nums1.length; i++){
            nums1[i] = nums2[x];
            x++;
        }
        for(int i=1; i<nums1.length; i++){
            int j = i-1;
            int key = nums1[i];
            while(j>=0 && nums1[j]>key){
                nums1[j+1] = nums1[j];
                j--;
            }
            nums1[j+1] = key;
        }
    }
}