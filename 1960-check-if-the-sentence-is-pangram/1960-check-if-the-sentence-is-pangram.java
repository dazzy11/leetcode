class Solution {
    public boolean checkIfPangram(String s) {
        String a="abcdefghijklmnopqrstuvwxxyz";
        for(int i=0;i<a.length();i++){
            if(s.indexOf(a.charAt(i))==-1)
            return false;
        }
        return true;
    }
}