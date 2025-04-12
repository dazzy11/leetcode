class Solution {
    public List<Integer> stableMountains(int[] h, int t) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<h.length;i++)
            if(h[i-1]>t) l.add(i);
        return l;
    }
}