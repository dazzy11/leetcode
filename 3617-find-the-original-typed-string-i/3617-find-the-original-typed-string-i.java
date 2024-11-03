class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        for(int i=word.length()-1;i>0;i--){
            if(word.charAt(i)==word.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}