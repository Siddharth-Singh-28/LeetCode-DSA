class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() != 2 ){
            int first = 0;
            int second = 1;
            StringBuilder num = new StringBuilder();
            while(second < s.length()){
                int num1 = s.charAt(first) - '0';
                int num2 = s.charAt(second) - '0';
                int sum = ((num1 + num2) % 10);
                num.append(sum);
                first++;
                second++;
            }
            s = num.toString();
        }
        if(s.charAt(0) == s.charAt(1)){
            return true;
        }
        else{
            return false;
        }
    }
}