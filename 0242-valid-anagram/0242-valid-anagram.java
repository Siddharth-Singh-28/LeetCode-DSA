class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hmap = new HashMap<>();
        for(char x : s.toCharArray()){
            hmap.put(x, hmap.getOrDefault(x,0) + 1);
        }
        for(char x : t.toCharArray()){
            hmap.put(x, hmap.getOrDefault(x,0) - 1);
        }

        for(int val : hmap.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}