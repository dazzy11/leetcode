class Solution {
    public int numJewelsInStones(String j, String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int k=0;k<j.length();k++){
                if(s.charAt(i)==j.charAt(k)){
                    count++;
                }
            }
        }
        return count;
    }
}