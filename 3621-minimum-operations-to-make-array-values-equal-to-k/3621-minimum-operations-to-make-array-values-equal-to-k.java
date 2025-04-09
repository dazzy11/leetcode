class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0,n=k;
        for(int i:nums){
            if(i<n) return -1;
            if(i>k) c++;
                k=i;
        }
        return c==0 ? 0:c;
    }
}