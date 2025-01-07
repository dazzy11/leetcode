class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            sub(words,i,ans);
        }
        return ans;
    }
    public static void sub(String[] words,int i,List<String> ans){
        for(int j=0;j<words.length;j++){
            if(j!=i&&words[j].contains(words[i])){
                ans.add(words[i]);
                break;
            }
        }
    }
}