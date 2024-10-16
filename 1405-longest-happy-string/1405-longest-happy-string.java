class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a1,b1) -> {
            return b1.count-a1.count;
        });
        
        if(a>0) pq.add(new Pair(a,'a'));
        if(b>0) pq.add(new Pair(b,'b'));
        if(c>0) pq.add(new Pair(c,'c'));
        
        
        StringBuilder sb  = new StringBuilder();
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            int count = p.count;
            char ch = p.character;
            
            if(sb.length()>=2 && sb.charAt(sb.length()-1)==ch && sb.charAt(sb.length()-2)==ch) {
                if(pq.isEmpty()) break;
                Pair p1 = pq.poll();
                sb.append(p1.character);
                if(p1.count-1>0) pq.add(new Pair(p1.count-1,p1.character));
            }else {
                sb.append(ch);
                count--; 
            }
            if(count>0) pq.add(new Pair(count,ch));
        }
        return sb.toString();
    }
}

class Pair {
    int count;
    char character;
    Pair(int count, char character) {
        this.count = count;
        this.character = character;
    }
}