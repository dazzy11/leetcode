class Solution {
    public int largestAltitude(int[] g) {
        int n=0,max=Integer.MIN_VALUE;
        for(int i=0;i<g.length;i++){
            max=Math.max(max,n);
            n=n+g[i];
        }
        return Math.max(max,n);
    }
}