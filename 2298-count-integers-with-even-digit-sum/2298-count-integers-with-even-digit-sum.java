class Solution {
    public int countEven(int num) {
            int sum=0,n=num;
            while(n>0){
                sum=n%10+sum;
                n=n/10;
            }
            if(sum%2==0)
               return num/2;
           return --num/2;
    }

}