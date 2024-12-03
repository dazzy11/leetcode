class Solution {
    public String addSpaces(String s, int[] spaces) {
        int c=0;
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<spaces.length;i++){
            st.insert(spaces[i]+c," ");
            c++;
        }
        return st.toString();
    }
}