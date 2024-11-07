class Solution {
    public int largestCombination(int[] can) {
        int c,k=0,max=0;
        for(int j=0;j<32;j++){
            k=0;
            for(int i=0;i<can.length;i++){
                if(((can[i]>>j)&1)==1)
                    k++;
            }
            max=Math.max(max,k);
        }
        return max;
    }
}