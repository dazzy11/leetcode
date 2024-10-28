class Solution {
    public int minAddToMakeValid(String s) {
        char[] arr=s.toCharArray();
        int open=0,close=0,c=0;
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
                c++;
                open=0;
            }
            if(close<0){
                c++;
                close=0;
            }
        }
        return c;
    }
}