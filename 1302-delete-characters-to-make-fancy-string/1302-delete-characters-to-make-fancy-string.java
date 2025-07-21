class Solution {
    public String makeFancyString(String s) {
        String st="";
        if(s.length()<3)
        return s;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2))
            continue;
            else
            st=st+s.charAt(i);
        }
        st=st+s.charAt(s.length()-2)+s.charAt(s.length()-1);
        return st;
    }
}