class Solution {
    public int findKthLargest(int[] a, int k) {
        PriorityQueue <Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();
    }
}