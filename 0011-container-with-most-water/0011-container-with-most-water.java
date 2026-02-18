class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length - 1;
        while(start < end) {
            int currArea;
            if(height[start] < height[end]) {
                currArea = height[start] * (end - start);
                maxArea = Math.max(maxArea, currArea);
                start++;
            }
            else {
                currArea = height[end] * (end-start);
                maxArea = Math.max(maxArea, currArea);
                end--;
            }
        }
        return maxArea;
    }
}