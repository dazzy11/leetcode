class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s=new HashSet<>();
        if(nums[nums.length-1]<0){
            return nums[nums.length-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
        s.add(nums[i]);
            }
        }
        int sum=0;
        for(int t:s){
            sum+=t;
        }
        return sum;
    }
}