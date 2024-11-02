class Solution {
    public boolean isCircularSentence(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '&&s.charAt(i-1)!=s.charAt(i+1)){
                return false;
            }
            if(s.charAt(i)==' '){
                count++;
            }
        }
        if(s.charAt(0)!=s.charAt(s.length()-1))
                return false;
        return true;
    }
}