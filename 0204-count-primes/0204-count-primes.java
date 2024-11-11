class Solution {
    public int countPrimes(int n) {
        boolean [] s=new boolean[n+1];
        for(int i=2;i<=n;i++){
            s[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(s[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    s[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(s[i]==true){
                count++;
            }
        }
        return count;
    }
}