class Solution {
    public boolean isAnagram(String s, String t) {
        int [] dp= new int[26];
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++){
            dp[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            dp[t.charAt(i)-'a']--;
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]!=0)
            return false;
        }
        return true;
    }
}