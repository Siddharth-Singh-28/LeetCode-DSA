class Solution {
    public boolean isPowerOfThree(int n) {
        return recursiveFunction(n, 0);
    }
    public boolean recursiveFunction(int n, int i){
        if(n<Math.pow(3,i))
            return false;
        else if(n==Math.pow(3,i))
            return true;
        else
            return recursiveFunction(n, i+1);
    }
}