class Solution {
    public int maxContainers(int n, int w, int max) {
        n=n*n;
        for(int i=n;i>0;i--){
            if((i*w)<=max)
            return i;
        }
        return 0;
    }
}