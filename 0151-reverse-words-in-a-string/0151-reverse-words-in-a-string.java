class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] st = s.split("\\s+");
        for (int i = 0, j = st.length - 1; i < st.length / 2; i++, j--) {
            String t = st[i];
            st[i] = st[j];
            st[j] = t;
        } 
        return String.join(" ", st);
    }
}