class Solution {
    public String truncateSentence(String s, int k) {
        String g="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') g=g+s.charAt(i);
            else if(c<k-1){ c++;
                 g=g+s.charAt(i);
                }
                else return g;
        }
        return g;
    }
}