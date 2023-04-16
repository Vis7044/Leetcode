class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        int l=0,h=arr.size()-1;
        unordered_set<int>set;
        for(int i=0;i<arr.size();i++){
            if(set.find(2*arr[i])!=set.end()) return true;
            if(arr[i]%2== 0 and set.find(arr[i]/2)!=set.end()) return true;
            set.insert(arr[i]);
        }
       
        return false;
    }
};