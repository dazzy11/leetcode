class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int dist=r;
        int max=0;
        while(l<r){
            int wat=Math.min(h[l],h[r])*dist;
            max=Math.max(wat,max);
            dist--;
            if(h[l]<h[r]){
                l++;
            }
            else
            r--;
        }
        return max;
    }
}