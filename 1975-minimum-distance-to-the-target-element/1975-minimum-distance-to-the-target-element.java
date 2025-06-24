class Solution {
    public int getMinDistance(int[] nums, int t, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) if(nums[i]==t&&(Math.abs(i-start))<min) min=Math.abs(i-start);
        return min;
    }
}