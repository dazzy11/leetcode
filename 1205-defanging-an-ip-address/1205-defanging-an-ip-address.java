class Solution {
    public String defangIPaddr(String a) {
        String t="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='.') t+=a.charAt(i);
            else t+="[.]";
        }
        return t;
    }
}