class Solution {
    public int minimumMoves(String s) {
        int c=0,i=0;
        while(i<s.length()){
           if(s.charAt(i)=='X'){
            c++;
            i=i+3;
           }
           else{
            i++;
           }
        }
        return c;
    }
}