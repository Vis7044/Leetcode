class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();
        for(int it: nums) {
            arr.add(String.valueOf(it));
        }
        
        Collections.sort(arr,(a,b)-> (b+a).compareTo(a+b));
        if(arr.get(0).equals("0")) return "0";
        StringBuilder s = new StringBuilder();
        for(String it: arr) {
            s.append(it);
        }
        return s.toString();
    }
}