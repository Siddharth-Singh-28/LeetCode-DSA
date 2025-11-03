class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int key : map.keySet()){ 
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> result = new ArrayList<>();

        // The loop condition 'result.size() <= k' should probably be 'result.size() < k'
        // to stop exactly after k elements are added, but 'addAll' might add more.
        // It's safer to check the size *after* adding.
        for(int i = bucket.length - 1; i > 0; i--){
            if(bucket[i] != null){
                for (int num : bucket[i]) {
                    if (result.size() < k) { // Stop once k elements are found
                        result.add(num);
                    } else {
                        break;
                    }
                }
            }
            if (result.size() == k) break; // If k elements are found, stop the main loop
        }
        
        // Line 25: The fix for the error:
        return result.stream().mapToInt(i -> i).toArray();
    }
}