class Pair {
    int num,freq;
    Pair(int freq,int num) {
        this.num = num;
        this.freq = freq;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int a: nums) {
            mp.put(a, mp.getOrDefault(a,0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq==b.freq) {
                return b.num-a.num;
            }
            else return a.freq-b.freq;
        });
        
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()) {
            pq.add(new Pair(entry.getValue(),entry.getKey()));
        }
        
        int []arr = new int[nums.length];
        int i=0;
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            int cnt = p.freq;
            for(int j=0;j<cnt;j++) {
                arr[i++] = p.num;
            }
        }
        return arr;
    }
}