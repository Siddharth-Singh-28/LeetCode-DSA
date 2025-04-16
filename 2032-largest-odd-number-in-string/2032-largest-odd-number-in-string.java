class Solution {
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        while(num.length()>0){
            if(num.charAt(i)=='1'||num.charAt(i)=='3'||num.charAt(i)=='5'||num.charAt(i)=='7'||num.charAt(i)=='9'){
                return num;
            }
            i--;
            num = num.substring(0, num.length()-1);
        }
        return "";
    }
}