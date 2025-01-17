class Solution {
    public int numJewelsInStones(String j, String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int count=0;
        for(int i=0;i<j.length();i++){
            map.put(j.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                count++;
        }
        return count;
    }
}