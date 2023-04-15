class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
         int count = 0;
        for (int i = 0; i < flowerbed.size(); i++) {
        // the curr plot must be empty && the previous plot is empty && the next plot is empty
        // exception: the first plot is empty || the last is empty
        if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
        && (i == flowerbed.size() - 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i] = 1;
            count++;
        }
        if (count >= n) {
            return true;
        }
    }
    
    return false;
    }
};