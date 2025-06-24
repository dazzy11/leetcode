class Solution {
    public List<Integer> findKDistantIndices(int[] n, int key, int k) {
        List <Integer> a=new ArrayList<>();
        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                a.add(i);
            }
        }
        List <Integer> m=new ArrayList<>();
        for(int i=0;i<n.length;i++){
            for(int j=0;j<a.size();j++){
                if(Math.abs(i-a.get(j))<=k){
                    m.add(i);
                    break;
                }
            }
        }
        return m;
    }
}