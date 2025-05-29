class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length-1;
        int k = piles[n];
        int start = 1;
        int end = k;
        int count = 0;
        int mid = 0;
        while(start<end){
            mid = start + (end-start)/2;
            for(int j=0; j<=n; j++){
                count += (int) Math.ceil((double) piles[j] / mid);
            }
            if(count<=h){
                end = mid;
            }
            else{
                start = mid + 1;
            }
            count = 0;
        }
        return start;
    }
}