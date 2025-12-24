class Solution {
    public int minimumBoxes(int[] a, int[] c) {
        Arrays.sort(c);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        int co=0;
       for(int i=c.length-1;i>=0;i--){
        if(sum>0){
            co++;
            sum-=c[i];
        }
       }
       return co;
    }
}