class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int i=0,c=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]||nums[i]>nums[i+1]){
                nums[i+1]++;
                c++;
            }
            else{
            i++;
            }
        }
        return c;
    }
}