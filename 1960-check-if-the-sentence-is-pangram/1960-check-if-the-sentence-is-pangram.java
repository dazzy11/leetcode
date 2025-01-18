class Solution {
    public boolean checkIfPangram(String s) {
        String c="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<c.length();i++){
            if(s.indexOf(c.charAt(i))==-1)
            return false;
        }
        return true;
    }
}