class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while(start<=end)
        {
            int mid = start + (end-start) / 2;
            if((long)mid*mid>(long)num)
            end = mid - 1;
            else if(mid*mid==num)
            return true;
            else
            start = mid + 1;
        }
        return false;
    }
}