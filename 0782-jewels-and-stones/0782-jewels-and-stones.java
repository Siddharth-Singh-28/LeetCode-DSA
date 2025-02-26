class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        int counter = 0;
        for(char stone : stones.toCharArray()){
            map.put(stone, map.getOrDefault(stone, 0) + 1);
        }
        for(char jewel : jewels.toCharArray()){
            counter += map.getOrDefault(jewel, 0);
        } 
        return counter;
    }
}