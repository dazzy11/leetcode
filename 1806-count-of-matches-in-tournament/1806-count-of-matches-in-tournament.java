class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1){
            if(n%2==0){
                sum=(n/2)+sum;
                n=n/2;
            }
            else{
                sum=((n-1)/2)+sum;
                n=((n-1)/2)+1;
            }
        }
        return sum;
    }
}