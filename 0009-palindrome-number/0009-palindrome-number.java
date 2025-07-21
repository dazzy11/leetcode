class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)
        return false;
        int temp=x,sum=0;
       while(x>0){
        int rem=x%10;
        sum=sum*10+rem;
        x=x/10;
       }
       return sum==temp;
    }
}