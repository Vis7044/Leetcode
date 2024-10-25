class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String s = folder[0];
        List<String> ans = new ArrayList<>();
        ans.add(s);
        for(int i=1;i<folder.length;i++) {
            if(!folder[i].startsWith(s+"/")) {
                ans.add(folder[i]);
                s=folder[i];
            }
        }
        return ans;
    }
}