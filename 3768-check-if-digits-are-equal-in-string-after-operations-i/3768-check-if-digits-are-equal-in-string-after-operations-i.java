class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) { // simpler and clearer condition
            StringBuilder next = new StringBuilder(s.length() - 1);
            for (int i = 0; i < s.length() - 1; i++) {
                int sum = ((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10;
                next.append(sum);
            }
            s = next.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
