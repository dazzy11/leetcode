class Solution {
    public int longestValidParentheses(String s) {
        char[] arr=s.toCharArray();
        int open=0,close=0;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            if(arr[i]=='('){
                open++;
            }
             if(arr[i]==')'){
                open--;
            }
            if(arr[j]==')'){
                close++;
            }
            if(arr[j]=='('){
                close--;
            }
            if(open<0){
                arr[i]='*';
                open=0;
            }
            if(close<0){
                arr[j]='*';
                close=0;
            }
        }
        open=0;
        close=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='*'){
                close=0;
            }
            if(arr[i]!='*'){
                close++;
            }
            open=Math.max(open,close);
        }
        return open;
    }
}