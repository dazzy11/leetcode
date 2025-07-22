class Solution {
    public boolean isSameAfterReversals(int num) {
        String str = String.valueOf(num);
        if(str.length()==1)
            return true;
        if(str.charAt(str.length()-1)=='0')
            return false;
        return true;
    }
}