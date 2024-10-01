class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
		int dp[]=new int[n];
		dp[0]=nums[0];
		for(int i=1;i<n;i++) {
			dp[i]=nums[i]+(Math.max(0, dp[i-1]));
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<dp.length;i++) {
			if(dp[i]>max)
				max=dp[i];
		}
//		System.out.println(Arrays.toString(dp));
		return max;
    }
}