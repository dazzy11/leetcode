class Solution {
    public String compressedString(String word) {
        int count=1;
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                count++;
            }
            if(count>9){
                ans.append("9");
                ans.append(word.charAt(i));
                count=1;
            }
            if(word.charAt(i)!=word.charAt(i-1)){
                ans.append((char)(count+'0'));
                count=1;
                ans.append(word.charAt(i-1));
            }
        }
        ans.append(count);
        ans.append(word.charAt(word.length()-1));
        return ans.toString();
    }
}