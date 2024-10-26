class Solution {
    public int lengthOfLastWord(String s) {
        String[] an=s.split(" ");
        return an[an.length-1].length();
    }
}