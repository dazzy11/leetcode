class Solution {
    public String makeFancyString(String s) {
        StringBuilder st=new StringBuilder();
        if(s.length()<2){
            return s;
        }
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2)){
                continue;
            }
                st.append(s.charAt(i));
        }
         st.append(s.charAt(s.length()-2));
         st.append(s.charAt(s.length()-1));
        return String.valueOf(st);
    }
}