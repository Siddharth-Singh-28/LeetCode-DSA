class Solution {
    public int maxDifference(String s) {
        int N = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddFrequency = maxOddFrequencyFinder(map);
        int evenFrequency = minEvenFrequencyFinder(map);
        return (oddFrequency - evenFrequency);
    }
    public int maxOddFrequencyFinder(HashMap<Character, Integer> map){
        int maxFrequency = 0;
        for(int i: map.values()){
            if(i%2==1 && i>maxFrequency){
                maxFrequency = i;
            }
        }
        return maxFrequency;
    }
    public int minEvenFrequencyFinder(HashMap<Character, Integer> map){
        int minFrequency = Integer.MAX_VALUE;
        for(int i: map.values()){
            if(i%2==0 && i<minFrequency){
                minFrequency = i;
            }
        }
        return minFrequency;
    }
}