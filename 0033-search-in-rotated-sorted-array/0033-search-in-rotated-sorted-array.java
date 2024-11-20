class Solution {
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        int index = leftbinarysearch(nums, target, pivot);
        if(index!=-1)
        return index;
        else
        return rightbinarysearch(nums, target, pivot);
    }
    public int findpivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start<=end)
        {
            mid = start + ((end-start)/2);
            if(mid==0||mid==nums.length-1)
            return mid;
            else if(nums[mid]>nums[mid+1])
            return mid;
            else if(nums[mid]<nums[mid-1])
            return mid-1;
            else if(nums[start]>nums[mid])
            end = mid-1;
            else
            start = mid + 1;
        }
        return mid;
    }
    public int leftbinarysearch(int[]nums, int target, int pivot)
    {
        int start = 0;
        int end = pivot;
        while(start<=end)
        {
            int mid = start + ((end-start)/2);
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            start = mid + 1;
            else
            end = mid - 1;
        }
        return -1;
    }
    public int rightbinarysearch(int[]nums, int target, int pivot)
    {
        int start = pivot + 1;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + ((end-start)/2);
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            start = mid + 1;
            else
            end = mid - 1;
        }
        return -1;
    }
}