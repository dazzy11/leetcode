class Solution {
    public int strStr(String hay, String nee) {
        if(hay.contains(nee))
            hay=hay.replace(nee,"-");
        for(int i=0;i<hay.length();i++){
            if(hay.charAt(i)=='-')
                return i;
        }
        return -1;
    }
}