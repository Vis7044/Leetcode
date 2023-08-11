class Solution {
    public void swap(int[] arr, int i,int l){
        int k;
        k=arr[i];
        arr[i]=arr[l];
        arr[l]=k;
    }
    public void perm(int index, List<List<Integer>> pr,int []arr){
        if(index==arr.length-1){
            List<Integer> p = new ArrayList<>();
            for(int x: arr){
                p.add(x);
            }
            pr.add(p);
            return;
        }
        for(int i=index;i<arr.length;i++) {
            swap(arr,i,index);
            perm(index+1,pr,arr);
            swap(arr,i,index);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        
        perm(0,ls,nums);
        return ls;
    }
}