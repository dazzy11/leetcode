class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            int a=q.poll();
            for(int j=0;j<nums.length;j++){
                if(a==nums[j]){
                    nums[j]=a*m;
                    q.add(nums[j]);
                    break;
                }
            }
        }
        return nums;
    }
}