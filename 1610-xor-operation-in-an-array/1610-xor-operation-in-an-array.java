class Solution {
    public int xorOperation(int n, int start) {
        int j=0,i=start+2,xor=start;
        while(j<n-1){
            xor=xor^i;
            j++;
            i=i+2;
        }
        return xor;
    }
}