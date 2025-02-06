class Solution {
    public int isPrefixOfWord(String s, String se) {
        String[] ar=s.split(" ");
        for(int i=0;i<ar.length;i++){
            if(ar[i].startsWith(se))
            return i+1;
        }
        return -1;
    }
}