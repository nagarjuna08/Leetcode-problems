class Solution {
    public String frequencySort(String s) {

       Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        } 
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
        (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(freqMap.entrySet());
        StringBuilder str =new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char key=entry.getKey();
            int frequency = entry.getValue(); // Corrected to get value directly
            
            // Repeat character 'frequency' times
            str.append(String.valueOf(key).repeat(Math.max(0, frequency)));
        }
        return str.toString();
    }
}