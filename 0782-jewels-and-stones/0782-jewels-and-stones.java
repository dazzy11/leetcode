class Solution {
    public int numJewelsInStones(String j, String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
            map.put(s.charAt(i),1);
        }
        for(int i=0;i<j.length();i++){
            if(map.containsKey(j.charAt(i)))
                count+=map.get(j.charAt(i));
        }
        return count;
    }
}