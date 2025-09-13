class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        String v="aeiou";
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max1=0,max2=0;
        for(char c : s.toCharArray()){
            if(v.indexOf(c)!=-1){
                max1=Math.max(max1,map.get(c));
            }
            else{
                max2=Math.max(max2,map.get(c));
            }
        }
        return max1+max2;
    }
}