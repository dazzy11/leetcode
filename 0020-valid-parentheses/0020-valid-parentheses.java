class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                char t=st.pop();
                if((t=='('&&s.charAt(i)!=')')||(t=='{'&&s.charAt(i)!='}')||(t=='['&&s.charAt(i)!=']')){
                    return false;
                }
            }
        }
        return true;
    }
}