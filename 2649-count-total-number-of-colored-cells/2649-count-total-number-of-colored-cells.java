class Solution {
    public long coloredCells(int n) {
        long sum=1;
            for(int i=0;i<n;i++)
                sum=sum+(i*4);
        return sum;
    }
}