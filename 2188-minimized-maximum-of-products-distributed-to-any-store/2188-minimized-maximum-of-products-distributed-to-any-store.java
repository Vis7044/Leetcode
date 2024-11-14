class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 0;
        for (int q : quantities) {
            high = Math.max(high, q); 
        }
        
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(n, mid, quantities)) {
                result = mid;  
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    private boolean isPossible(int n, int mid, int[] quantities) {
        int storesNeeded = 0;
        for (int q : quantities) {
            storesNeeded += Math.ceil((double)q/mid);  
            if (storesNeeded > n) {
                return false;  
            }
        }
        return true;
    }
}
