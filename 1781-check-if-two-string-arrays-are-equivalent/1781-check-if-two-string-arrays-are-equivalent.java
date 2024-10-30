class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="",s1="";
        for(int i=0;i<word1.length;i++){
            s=s+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            s1=s1+word2[i];
        }
        if(s.equals(s1)){
            return true;
        }
        return false;

    }
}