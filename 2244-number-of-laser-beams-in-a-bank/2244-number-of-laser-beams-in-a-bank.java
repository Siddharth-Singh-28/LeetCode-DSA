class Solution {
    public int numberOfBeams(String[] bank) {
        int totalLasers = 0;
        int previousRowBeams = 0;
        for(String row : bank){
            int currentRowBeams = 0;
            for(char c : row.toCharArray()){
                if(c == '1'){
                    currentRowBeams++;
                }
            }
            if(currentRowBeams > 0){
                totalLasers += previousRowBeams * currentRowBeams;
                previousRowBeams = currentRowBeams;
            }
        }
        return totalLasers;
    }
}