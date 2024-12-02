class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(n);
        set.add(1);
        int result = 0;
        while(true){
            result = recursion(n);
            if(set.contains(result)){
                if(result==1)
                {
                    return true;
                }
                return false;
            }
            set.add(result);
            n = result;
        }
    }
    public int recursion(int n){
        int sum = 0;
        while(n>0){
            sum = (int)(sum + Math.pow(n%10,2));
            n = n/10;
        }
        return sum;
    }
}