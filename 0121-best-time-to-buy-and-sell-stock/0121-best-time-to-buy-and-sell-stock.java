class Solution {
    public int maxProfit(int[] p) {
        int min=p[0],pro=0;
        for(int i=1;i<p.length;i++){
            min=Math.min(min,p[i]);
            pro=Math.max(pro,p[i]-min);
        }
        return pro;
    }
}