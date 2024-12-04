class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            builder.append((char) (columnNumber % 26 + 'A'));
            columnNumber = columnNumber/26;
        }
        return builder.reverse().toString();
    }
}