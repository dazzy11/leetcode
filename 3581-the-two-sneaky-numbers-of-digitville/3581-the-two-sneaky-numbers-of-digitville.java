class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int j=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                ans[j++]=nums[i];
            }
            else{
                s.add(nums[i]);
            }
        }
        return ans;
    }
}