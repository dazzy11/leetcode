class Solution {
    public int minOperations(int[] nums) {
        int count=-1;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                count++;
                nums[i]=1;
                if(nums[i+1]==1){
                    nums[i+1]=0;
                }
                else{
                    nums[i+1]=1;
                }
                if(nums[i+2]==1){
                    nums[i+2]=0;
                }
                else{
                    nums[i+2]=1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            return -1;
        }
        return count+1;
    }
}