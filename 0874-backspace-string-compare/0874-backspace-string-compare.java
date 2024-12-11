class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> sd=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'&&(!st.isEmpty())){
                st.pop();
                continue;
            }
            if(s.charAt(i)!='#')
                st.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'&&(!sd.isEmpty())){
                sd.pop();
                continue;
            }
            if(t.charAt(i)!='#')
                sd.push(t.charAt(i));
        }
        if(st.size()!=sd.size()){
            System.out.println("stackdiff");
            System.out.println(st);
            System.out.println(sd);
            return false;
        }
        for(int i=0;i<st.size();i++){
            if(st.get(i)!=sd.get(i)){
                return false;
            }
        }
        return true;

    }
}