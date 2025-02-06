class Solution {
    public int finalValueAfterOperations(String[] o) {
        int x=0;
        for(int i=0;i<o.length;i++){
            if(o[i].contains("-"))
                x=x-1;
            else
                x=x+1;
        }
        return x;
    }
}