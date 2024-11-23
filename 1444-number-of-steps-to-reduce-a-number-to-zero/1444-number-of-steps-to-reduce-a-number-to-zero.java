class Solution {
    public int numberOfSteps(int num) {
        return recursiveFunction(num, 0); 
    }
    public int recursiveFunction(int n, int steps){
        if(n==0){
            return steps;
        }
        else if(n%2==0){
            return recursiveFunction(n/2, steps+1);
        }
        else{
            return recursiveFunction(n-1, steps+1);
        }
    }
}