class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        String result = "";
        for(int i=arr.length - 1; i>0; i--) {
            result += arr[i] + " ";
        }
        result = result + arr[0];
        return result;
    }
}