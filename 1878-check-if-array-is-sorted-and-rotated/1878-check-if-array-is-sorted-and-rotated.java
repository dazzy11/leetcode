class Solution {
    public boolean check(int[] nums) {
        int[] ori=nums.clone();
        Arrays.sort(ori);
        for(int j=0;j<nums.length;j++){
        int temp=nums[0];
        for(int i=0;i<nums.length-1;i++){
                   nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;
    if(Arrays.equals(ori, nums)){
         return true;
    }
    }
         return false;
    }
}