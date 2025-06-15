class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        char x = ' ';
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='9'){
                x = s.charAt(i);
                break;
            }
        }
        int maxValue = Integer.parseInt(s.replace(x, '9'));

        int minValue = Integer.parseInt(s);
        for(int i=0; i<s.length(); i++){
            if(i==0 && s.charAt(i)!='1'){
                x = s.charAt(i);
                minValue = Integer.parseInt(s.replace(x, '1'));
                break;
            }
            else if(i!=0 && (s.charAt(i)!='1' && s.charAt(i)!='0')){
                x = s.charAt(i);
                minValue = Integer.parseInt(s.replace(x, '0'));
                break;
            }
        }
        return (maxValue - minValue);
    }
}