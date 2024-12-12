class Solution {
    public long pickGifts(int[] g, int k) {
     PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
     long sum=0;
        for(int i=0;i<g.length;i++)
            q.add(g[i]);
        for(int i=0;i<k;i++){
            int a=q.poll();
            q.add((int)Math.sqrt(a));
        }
        while(!q.isEmpty())
            sum+=q.poll();
        return sum;
    }
}