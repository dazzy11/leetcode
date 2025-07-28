class Solution {
    public int[] shuffle(int[] nums, int n) {
        int base=10000;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+base*nums[n+i];
        }
        for(int i=n-1;i>=0;i--){
            int x=nums[i]/base;
            int y=nums[i]%base;
            nums[i*2+1]=x;
             nums[i*2]=y;
        }
        return nums;
    }
}