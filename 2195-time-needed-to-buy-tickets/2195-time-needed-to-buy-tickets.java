class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int i=0,c=0;
        while(t[k]>0){
            if(i<t.length){
                if(t[i]>0){
            t[i]--;
            c++;
                }
                i++;
            }
            else{
                i=0;
            }
        }
        return c;
    }
}