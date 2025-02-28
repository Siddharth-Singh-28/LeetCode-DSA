class Solution {
    public int strStr(String haystack, String needle) {
        int start = 0;
        int end = needle.length();
        while(end<=haystack.length()){
            if(haystack.substring(start,end).equalsIgnoreCase(needle)){
                return start;
            }
            else{
                start+= 1;
                end += 1;
            }
        }
        return -1;
    }
}