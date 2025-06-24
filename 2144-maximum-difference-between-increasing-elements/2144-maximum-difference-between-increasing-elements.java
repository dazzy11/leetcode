class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0],sum=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                sum=Math.max(sum,nums[i]-min);
            }
            else{
                min=nums[i];
            }
        }
        return sum;
    }
}