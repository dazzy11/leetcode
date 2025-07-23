class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                int t=nums[i];
                while(nums[i]>0){
                    sum1+=nums[i]%10;
                    nums[i]=nums[i]/10;
                }
                sum2+=t;
            }
            else{
                sum1+=nums[i];
                sum2+=nums[i];
            }
        }
        System.out.println(sum1+" "+sum2);
        return Math.abs(sum1-sum2);
    }
}