class Solution {
    public int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        int[] dp=new int[n+1];
        int prev=1;
        int curr=1;
        int next=0;
        for(int i=1;i<n;i++){
            next=prev+curr;
            prev=curr;
            curr=next;
        }
        return curr;

    }
}