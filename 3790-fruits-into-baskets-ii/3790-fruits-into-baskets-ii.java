class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        for(int i=0;i<f.length;i++){
            for(int j=0;j<b.length;j++){
                if(f[i]<=b[j]){
                    b[j]=-1;
                    break;
                }
            }
        }
        int c=0;
        for(int i=0;i<b.length;i++){
            if(b[i]!=-1){
                c++;
            }
        }
        return c;
    }
}