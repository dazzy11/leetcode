class Solution {
    public int smallestNumber(int n, int k) {
        int sum=0;
        for(int i=n;i<=100;i++){
            sum=1;
            int t=i;
             while(t!=0){
            sum=(sum)*(t%10);
            t=t/10;
        }
        if(sum%k==0){
            return i;
        }
        }
        return -1;
    }
}