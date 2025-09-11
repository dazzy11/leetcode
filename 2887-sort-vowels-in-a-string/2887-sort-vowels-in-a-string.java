class Solution {
    public String sortVowels(String s) {
        char[] a=s.toCharArray();
        int [] freq=new int[128];
        for(char c:a){
            if (vowel(c))
            freq[c]++;
        }
        for(int j=0;j<a.length;j++){
            if(vowel(a[j])){
                for(int i=0;i<128;i++){
                    if(freq[i]>0){
                      a[j]=(char) i; 
                      freq[i]--; 
                      break;
                    }
                }
            }
            else{
                continue;
            }
        }
        return new String(a);
    }
    public static boolean vowel(char c){
        String t="aeiouAEIOU";
        if(t.indexOf(c)!=-1){
            return true;
        }
        return false;
    }
}