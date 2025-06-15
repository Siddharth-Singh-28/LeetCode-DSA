class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int resultantSize = nums1.length + nums2.length;
        int[] result = new int[resultantSize];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1 < nums1.length || index2 < nums2.length){
            if(index1 == nums1.length){
                result[index] = nums2[index2];
                index2++;
                index++;
            }
            else if(index2 == nums2.length){
                result[index] = nums1[index1];
                index1++;
                index++;
            }
            else{
                if(nums1[index1] < nums2[index2]){
                result[index] = nums1[index1];
                index1++;
                index++;
                }
                else{
                result[index] = nums2[index2];
                index2++;
                index++;
                }
            }
        }
        int start = 0;
        int end = resultantSize - 1;
        int median = 0;
        if(resultantSize % 2 == 1){
            median = start + (end - start) / 2;
            return(double) result[median];
        }
        else{
            median = start + (end - start) / 2;
            return (((double)result[median] + (double)result[median+1]) / 2);
        }
    }
}