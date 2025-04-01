class Solution {
    public int[] findErrorNums(int[] nums) {
        int s=nums.length*(nums.length+1)/2,m=0;
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s1.contains(nums[i])){ s1.add(nums[i]);
            s-=nums[i];
            }
            else
                m=nums[i];
        }
        return new int[] {m,s};
    }
}