class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0,doub=0;;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10)
                single+=nums[i];
            else
                doub+=nums[i];
        }
        if(single==doub)
            return false;
        return true;
    }
}