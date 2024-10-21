class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;
        if(n<=0){
            return false;
        }
        for(int i=0;i<31;i++){
            if((n&1)==1){
                count++;
                if(count>1){
                    return false;
                }
            }
            n=n>>1;
        }
        return true;
    }
}