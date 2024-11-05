class Solution {
    public int climbStairs(int n) {
       ArrayList<Integer> a=new ArrayList<>();
       a.add(1);
       a.add(1);
       for(int i=0;i<n;i++)
        a.add(a.get(i)+a.get(i+1));
       return a.get(n);
    }
}