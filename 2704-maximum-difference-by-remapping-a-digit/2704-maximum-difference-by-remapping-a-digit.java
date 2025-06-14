class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        char min = ' ';
        for(char c : s.toCharArray()){
            if(c != '9'){
                min = c;
                break;
            }
        }
        int maxValue = Integer.parseInt(s.replace(min, '9'));

        char max = ' ';
        for(char c : s.toCharArray()){
            if(c != '0'){
                max = c;
                break;
            }
        }
        int minValue = Integer.parseInt(s.replace(max, '0'));

        return (maxValue - minValue);
    }
}