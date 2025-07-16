class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        gen(ans,n,"",0,0);
        return ans;
    }
    public static void gen(List<String> ans,int n,String s,int open,int close){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            gen(ans,n,s+"(",open+1,close);
        }
        if(close<open){
            gen(ans,n,s+")",open,close+1);
        }
    }
}