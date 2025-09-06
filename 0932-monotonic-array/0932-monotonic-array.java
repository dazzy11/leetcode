class Solution {
    public boolean isMonotonic(int[] nums) {
        int d=0,c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            c=1;
            if(nums[i]>nums[i+1])
            d=1;
            if(c==1&&d==1)
            return false;
        }
        return true;
    }
}