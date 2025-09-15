class Solution {
    public int canBeTypedWords(String text, String bro) {
        int c=0;
        String[] s=text.split(" ");
        for(int i=0;i<s.length;i++){
            if(check(s[i],bro)){
                c++;
            }
        }
        return c;
    }
    public boolean check(String s, String b){
        for(int i=0;i<b.length();i++){
            if(s.indexOf(b.charAt(i))!=-1){
                return false;
            }
        }
        return true;
    }
}