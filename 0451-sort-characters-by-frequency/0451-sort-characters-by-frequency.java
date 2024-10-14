class Pair {
    int count;
    char c;
    public Pair(int count,char c) {
        this.count = count;
        this.c = c;
    }
}
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>  mp = new HashMap<>();
        for(char c: s.toCharArray()) {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.count-a.count);
        for(Map.Entry<Character,Integer> entry: mp.entrySet()) {
            pq.add(new Pair(entry.getValue(), entry.getKey()));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            int cnt = p.count;
            while(cnt!=0) {
                sb.append(p.c);
                cnt--;
            }
        }
        
        return sb.toString();
    
    }
}