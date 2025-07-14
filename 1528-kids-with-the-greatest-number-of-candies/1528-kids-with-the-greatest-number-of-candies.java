class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean> a=new ArrayList<>();
        int max=0;
        for(int i=0;i<c.length;i++){
            max=Math.max(max,c[i]);
        }
        for(int i=0;i<c.length;i++){
            if((c[i]+e)>=max){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
}