class Solution {
    public int majorityElement(int[] nums) {
        int n=nums[0],c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==n)
            c++;
            else{
                c--;
                if(c==0){
                    n=nums[i];
                    c=1;
                }
            }
        }
        return n;
    }
}