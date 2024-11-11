class Solution {
    public String longestPalindrome(String s) {
        String pal="";
        for (int len = s.length(); len > 0; len--) {
    for (int i = 0; i <= s.length() - len; i++) { 
        int j = i + len - 1; 
        if (ispal(s.substring(i, j + 1))) {
                    String m=s.substring(i,j+1);
                    if(m.length()>pal.length()){
                        pal=m;
                    }
                }
            }   
        }
        return pal;
    }
    public static boolean ispal(String z){
        int i=0;
        int j=z.length()-1;
        while(i<j){
            if(z.charAt(i)!=z.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}