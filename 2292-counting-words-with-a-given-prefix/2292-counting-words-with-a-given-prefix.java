class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(pref)==0)
                count++;
        }
        return count;
    }
}