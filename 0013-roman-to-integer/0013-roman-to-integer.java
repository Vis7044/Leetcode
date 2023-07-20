class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        mp.put('I',1);
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int sum=0,i=0;

        for(;i<s.length()-1;i++){
            if(mp.get(s.charAt(i))<mp.get(s.charAt(i+1))){
                sum+=mp.get(s.charAt(i+1))-mp.get(s.charAt(i));
                i++;
            }else{
                sum+=mp.get(s.charAt(i));
            }
        }
        if(i==s.length()-1)return sum+mp.get(s.charAt(i));
        else return sum;
        
        
    }
}