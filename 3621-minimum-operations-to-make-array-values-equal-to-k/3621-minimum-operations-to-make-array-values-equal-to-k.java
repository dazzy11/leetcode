class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0,n=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<n)
            return -1;
            if(nums[i]>k){
                c++;
                k=nums[i];
            }
        }
        return c==0 ? 0:c;
    }
}