class Solution {
    public long maxKelements(int[] nums, int k) {
     long score=0;
     PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++)
            q.add(nums[i]);
        for(int i=0;i<k;i++){
            int last=q.poll();
            score+=last;
            q.add((int)Math.ceil(last / 3.0));
        }
        return score;
    }
}