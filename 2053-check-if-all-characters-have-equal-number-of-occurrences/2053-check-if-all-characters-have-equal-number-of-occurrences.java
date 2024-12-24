class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray())
            arr[c-'a']++;
        for(int i=0;i<26;i++){
            if(arr[i]!=0&&arr[i]!=arr[s.charAt(0)-'a'])
               return false;
        }
        return true;
    }
}