class Solution {
    public String reverseWords(String s) {
        StringBuilder st = new StringBuilder();
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                st.append(s.charAt(i));
            } else {
                t = t + st.reverse() + " ";
                st.setLength(0);
            }
        }
        t = t + st.reverse();
        return t;
    }
}