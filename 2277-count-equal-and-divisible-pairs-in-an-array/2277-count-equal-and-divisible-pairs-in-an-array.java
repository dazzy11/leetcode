class Solution {
    public int countPairs(int[] n, int k) {
        int c=0,m=n.length;
        for(int i=0;i<m;i++) for(int j=i+1;j<m;j++) if(n[i] == n[j]&&(i*j)%k==0) c++;
        return c;
    }
}