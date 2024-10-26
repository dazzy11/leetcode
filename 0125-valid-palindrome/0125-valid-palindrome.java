class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}