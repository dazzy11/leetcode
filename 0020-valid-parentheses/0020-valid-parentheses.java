class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                st.add(c);
            }
            else{
                if(st.isEmpty()){
                return false;
            }
            else if(c==')'&&st.peek()=='('){
                st.pop();
            }
            else if(c=='}'&&st.peek()=='{'){
                st.pop();
            }
            else if(c==']'&&st.peek()=='['){
                st.pop();
            }
            else
            return false;
        }
    }
    if(st.isEmpty()){
        return true;
    }
    else{
        return false;
    }
}
}