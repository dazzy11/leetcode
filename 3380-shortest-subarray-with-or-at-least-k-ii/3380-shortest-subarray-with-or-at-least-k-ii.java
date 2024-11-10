class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        //atleast 1 -> xor 1
        // shortest special non-empty subarray
        // -1 if no special subarray exists
       int w = 0, min = Integer.MAX_VALUE;
        int[] bits = new int[32]; // bits' counts
        for (int l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] >= k) return 1;
            w |= nums[r];
            for (int i = 0; i < bits.length; i++) {
                bits[i] += (nums[r] >> i) & 1;
            }
            while (w >= k) {
                min = Math.min(min, r - l + 1);
                for (int i = 0; i < bits.length; i++) {
                    bits[i] -= (nums[l] >> i) & 1;
                    if (bits[i] == 0) w &= ~(1 << i);
                }
                l++;
            } 
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}