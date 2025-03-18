class Solution {
    public int maxArea(int[] h) {
        int l=0, max=0,r=h.length-1,dist=r;
        while(l<r){
            max=Math.max(Math.min(h[l],h[r])*dist,max);
            dist--;
            if(h[l]<h[r])
                l++;
            else
            r--;
        }
        return max;
    }
}