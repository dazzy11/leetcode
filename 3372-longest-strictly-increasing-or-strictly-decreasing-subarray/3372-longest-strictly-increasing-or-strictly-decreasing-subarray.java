class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1,count2=1,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            count++;
            else{
            max=Math.max(max,count);
            count=1;
            }
        }
        max=Math.max(max,count);
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]>nums[j+1]){
            count2++;
            }
            else{
            max=Math.max(max,count2);
            count2=1;
            }
        }
        max=Math.max(max,count2);
        return max;
    }
}