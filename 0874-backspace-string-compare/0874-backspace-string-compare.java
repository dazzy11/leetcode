class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> sd=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'&&(!st.isEmpty()))
                st.pop();
            if(s.charAt(i)!='#')
                st.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'&&(!sd.isEmpty()))
                sd.pop();
            if(t.charAt(i)!='#')
                sd.push(t.charAt(i));
        }
        return st.toString().equals(sd.toString());
    }
}