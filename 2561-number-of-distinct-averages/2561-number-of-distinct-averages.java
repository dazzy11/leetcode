class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> s= new HashSet<>();
        for(int i=0;i<nums.length/2;i++){
            double avg=(nums[i]+nums[nums.length-i-1])/2.0;
            s.add(avg);
        }
        return s.size();
    }
}