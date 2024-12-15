class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num % 2 != 0)
            return false;
        int temp=num;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                temp-=i;
        }
        return temp==0;
    }
}