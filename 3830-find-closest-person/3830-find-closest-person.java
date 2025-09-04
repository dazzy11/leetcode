class Solution {
    public int findClosest(int x, int y, int z) {
        int n=Math.abs(x-z);
        int m=Math.abs(y-z);
        if(n<m)
        return 1;
        if(n>m)
        return 2;
        else
        return 0;
    }
}