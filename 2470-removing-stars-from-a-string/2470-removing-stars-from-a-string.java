class Solution {
    public String removeStars(String s) {
        int c=0;
        String sr="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*'){
                c++;
            }
            else if(c>0){
                c--;
                continue;
            }
            if(s.charAt(i)!='*')
            sr=s.charAt(i)+sr;
        }
        return sr;
    }
}