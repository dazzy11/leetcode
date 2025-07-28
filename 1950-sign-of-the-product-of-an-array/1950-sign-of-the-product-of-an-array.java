class Solution {
    public int arraySign(int[] nums) {
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]>0){
                c=c*1;
            }
            else{
                c=c*-1;
            }
        }
        return c;
    }
}