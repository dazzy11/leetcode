class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] f=new int[101];
        int c=0;
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
        for(int i=0;i<f.length;i++){
            c=c+f[i]*(f[i]-1)/2;
        }
        return c;
    }
}