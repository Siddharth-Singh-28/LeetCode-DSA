/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int mid = findpeak(mountainArr);
        int pos;
        pos = findinAscending(mountainArr, target, mid);
        if(pos != - 1)
        return pos;
        else
        {
        pos = findinDescending(mountainArr, target, mid);
        return pos;
        }
    }
    public int findpeak(MountainArray mountainArr)
    {
        int start = 0;
        int end = mountainArr.length() - 1;
        int mid = 0;
        while(start<=end)
        {
            mid = start + ((end-start)/2);
            if(mountainArr.get(mid) < mountainArr.get(mid+1))
            start = mid + 1;
            else
            end = mid - 1;
        }
        return mid;
    }
    public int findinAscending(MountainArray mountainArr, int target, int mid)
    {
        int start = 0;
        int end = mid;
        while(start<=end)
        {
            int newMid = start + ((end-start)/2);
            if(mountainArr.get(newMid)==target)
            return newMid;
            else if(mountainArr.get(newMid)<target)
            start = newMid + 1;
            else
            end = newMid - 1;
        }
        return -1;
    }
    public int findinDescending(MountainArray mountainArr, int target, int mid)
    {
        int start = mid;
        int end = mountainArr.length() - 1;
        while(start<=end)
        {
            int newMid = start + ((end-start)/2);
            if(mountainArr.get(newMid)==target)
            return newMid;
            else if(mountainArr.get(newMid)<target)
            end = newMid - 1;
            else
            start = newMid + 1;
        }
        return -1;
    }
}