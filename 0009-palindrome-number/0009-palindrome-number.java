class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,temp=x;
        if(x<0){
            return false;
        }
            while(x>0){
                int rem=x%10;
                sum=sum*10+rem;
                x=x/10;
            }
            if(sum==temp)
            return true;
            return false;
    }
}