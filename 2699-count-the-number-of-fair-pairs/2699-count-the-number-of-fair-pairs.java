class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }
    private long count(int[] nums, int limit) {
        long res = 0;
        for (int l = 0, r = nums.length - 1; l < r; l++) {
            while (l < r && nums[l] + nums[r] > limit) {
                r--;
            }
            res += r - l;
        }
        return res;
    }
}