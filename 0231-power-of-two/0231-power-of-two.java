class Solution {
    public boolean isPowerOfTwo(int n) {
        return recursiveFunction(n, 0);
    }
    public boolean recursiveFunction(int n, int i){
        if(n<Math.pow(2,i))
            return false;
        else if(n==Math.pow(2,i))
            return true;
        else
            return recursiveFunction(n, i+1);
    }
}