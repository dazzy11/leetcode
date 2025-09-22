class Solution {
    public int maxFrequencyElements(int[] n) {
        int [] a=new int[101];
        for(int i=0;i<n.length;i++){
            a[n[i]]++;
        }
        int c=0,max=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                c=max;
            }
            else if(max==a[i]){
                c+=max;
            }
        }
        return c;
    }
}