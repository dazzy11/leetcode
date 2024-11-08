class Solution {
    public boolean checkString(String s) {
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)=='a'&&s.charAt(i-1)=='b'){
                return false;
            }
        }
        return true;
    }
}