class Solution {
    public int finalValueAfterOperations(String[] o) {
        int c=0;
        for(int i=0;i<o.length;i++){
            if(o[i].charAt(1)=='+'){
                c++;
            }
            else{
                c--;
            }
        }
        return c;
    }
}