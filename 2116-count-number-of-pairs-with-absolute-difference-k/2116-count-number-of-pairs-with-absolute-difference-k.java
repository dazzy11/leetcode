class Solution {
    public int countKDifference(int[] n, int k) {
        int count=0;
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(Math.abs(n[i]-n[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
}