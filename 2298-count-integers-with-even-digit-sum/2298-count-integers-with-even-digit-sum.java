class Solution {
    public int countEven(int num) {
        int sum=0,count=0;
        for(int i=1;i<=num;i++){
            int n=i;
            sum=0;
            while(n>0){
                sum=n%10+sum;
                n=n/10;
            }
            if(sum%2==0)
                count++;
        }
        return count;
    }

}