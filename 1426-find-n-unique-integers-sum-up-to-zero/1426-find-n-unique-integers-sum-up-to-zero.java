class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        
            for(int i=1;i<=n/2;i++){
                a.add(i);
                a.add(-i);
            }
        
        if(n%2!=0)
        a.add(0);
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        return arr;
    }
}