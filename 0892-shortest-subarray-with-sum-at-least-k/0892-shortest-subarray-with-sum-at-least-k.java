import java.util.*;

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        
        for (int i = 0; i < n; ++i) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        
        Deque<Integer> dq = new ArrayDeque<>();
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n; ++i) {
            while (!dq.isEmpty() && prefixSum[i] - prefixSum[dq.peekFirst()] >= k) {
                minLength = Math.min(minLength, i - dq.pollFirst());
            }
            
            while (!dq.isEmpty() && prefixSum[i] <= prefixSum[dq.peekLast()]) {
                dq.pollLast();
            }
            
            dq.addLast(i);
        }
        
        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
}