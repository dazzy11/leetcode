class Solution {
    public int subtractProductAndSum(int n) {
        int sum=1,num=0;
        while(n>0){
            int rem=n%10;
            sum*=rem;
            num+=rem;
            n=n/10;
        }
        return sum-num;
    }
}