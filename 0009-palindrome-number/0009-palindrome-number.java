class Solution {
    public boolean isPalindrome(int x) {
        int reverseNum = 0;
        int copy = x;
        while(x>0){
            reverseNum = (reverseNum*10) + (x % 10);
            x = x/10;
        }
        if(reverseNum == copy){
            return true;
        }
        else 
        return false;
    }
}