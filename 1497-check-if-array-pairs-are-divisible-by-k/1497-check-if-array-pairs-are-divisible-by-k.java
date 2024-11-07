class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int a: arr) {
            mp.put((a%k+k)%k,mp.getOrDefault((a%k+k)%k,0)+1);
        }
        if(mp.getOrDefault(0,0)%2!=0) return false;
        for (int i = 1; i <= k / 2; i++) {
            int countR = mp.getOrDefault(i, 0);
            int countComplement = mp.getOrDefault(k - i, 0);
            
            // For remainder pairs (i, k-i), their counts should match
            if (countR != countComplement) return false;
        }


        return true;
        
    }
}