class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:stones)
            q.add(i);
        while(!q.isEmpty()){
            if(q.size()==1)
            return q.poll();
            int x=q.poll();
            int y=q.poll();
            if(x-y>0){
                q.add(x-y);
            }
        }
        return 0;
    }
}