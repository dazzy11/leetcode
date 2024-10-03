class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int extra) {
        List<Boolean> ans= new ArrayList<>();
        int max=0;
        for(int i=0;i<can.length;i++){
            if(max<=can[i])
                max=can[i];
        }
        for(int i=0;i<can.length;i++){
            if((can[i]+extra)>=max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}