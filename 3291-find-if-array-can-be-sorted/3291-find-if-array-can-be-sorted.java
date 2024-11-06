class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]&&count(nums[i])!=count(nums[j])){
                    return false;
                }
            }
        }
        return true;
    }
    public static int count(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}