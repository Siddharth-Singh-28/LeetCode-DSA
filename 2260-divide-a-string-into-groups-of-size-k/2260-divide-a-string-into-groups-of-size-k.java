class Solution {
    public String[] divideString(String s, int k, char fill) {
        int N = (s.length() + k - 1) / k; // Ceiling of s.length() / k
        String[] result = new String[N];

        int index = 0;
        for (int i = 0; i < s.length(); i += k) {
            if (i + k <= s.length()) {
                result[index++] = s.substring(i, i + k);
            } else {
                StringBuilder temp = new StringBuilder(s.substring(i));
                while (temp.length() < k) {
                    temp.append(fill);
                }
                result[index++] = temp.toString();
            }
        }

        return result;
    }
}
