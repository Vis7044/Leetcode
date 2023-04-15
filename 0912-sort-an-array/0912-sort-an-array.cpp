class Solution {
public:
    void mergeSort(vector<int>&v,int l,int h){
        if(l<h){
            int mid = l + (h-l)/2;
            mergeSort(v,l,mid);
            mergeSort(v,mid+1,h);
            merge(v,l,mid,h);
        }
    }

    void merge(vector<int>&v,int l,int m,int h){
        int n=m-l+1;
        int z=h-m;
        int a1[n],a2[z];
        int i=0,j=0,k;
        for(i=0;i<n;i++){
            a1[i]=v[l+i];
        }
        for(j=0;j<z;j++){
            a2[j]=v[m+j+1];
        }
        i=0,j=0,k=l;
        while(i<n && j<z){
            if(a1[i]<=a2[j]) v[k++]=a1[i++];
            else v[k++]=a2[j++];
        }
        while(i<n){
            v[k++]=a1[i++];
        }
        while(j<z) v[k++]=a2[j++];
    }
    vector<int> sortArray(vector<int>& nums) {
        mergeSort(nums,0,nums.size()-1);
        return nums;
    }
    
};