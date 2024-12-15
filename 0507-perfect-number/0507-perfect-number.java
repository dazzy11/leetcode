class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp=num;
        for(int i=1;i<num;i++){
            if(num%i==0)
                temp-=i;
        }
        return temp==0;
    }
}