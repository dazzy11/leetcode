class Solution {
    public int findNonMinOrMax(int[] nums) {
       if(nums.length==2 || nums.length==1)return -1;
        if(nums[0]<nums[1] && nums[1]<nums[2] || nums[0]>nums[1] && nums[1]>nums[2])
        {
            return nums[1];
        }
        else if(nums[1]<nums[0] && nums[0]<nums[2] || nums[0]<nums[1] && nums[0]>nums[2])
        {
            return nums[0];
        }

        return nums[2];
    }
}