class Solution {
    public int minMovesToSeat(int[] se, int[] st) {
        int count=0;
        Arrays.sort(se);
        Arrays.sort(st);
        for(int i=0;i<se.length;i++){
            count+=Math.abs(se[i]-st[i]);
        }
        return count;
    }
}