class Solution {
    public long pickGifts(int[] g, int k) {
     PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
     long sum=0;
        for(int i=0;i<g.length;i++){
            q.add(g[i]);
        }
        for(int i=0;i<k;i++){
            int a=q.poll();
            int n=(int)Math.floor(Math.sqrt(a));
            q.add(n);
        }
        while(!q.isEmpty()){
            sum=sum+q.poll();
        }
        return sum;
    }
}