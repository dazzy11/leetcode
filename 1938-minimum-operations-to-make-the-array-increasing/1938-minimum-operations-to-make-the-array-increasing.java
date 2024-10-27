class Solution {
    public int minOperations(int[] nums) {
        int i=0,count=0;
        while(i<nums.length-1){
            if(nums[i]>=nums[i+1]){
                nums[i+1]++;
                count++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}