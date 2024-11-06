class Solution {
    public String generateTheString(int n) {
        String s;
        if(n%2==0){
        s="b";
        for(int i=0;i<n-1;i++){
            s=s+(char)('a');
        }
        }
        else{
         s="";
            for(int i=0;i<n;i++){
            s=s+(char)('a');
        }
        }
        return s;
    }
}