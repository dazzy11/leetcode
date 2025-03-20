class Solution {
    public int countPrimes(int n) {
        boolean[] arr=new boolean[n];
        if(n==0||n==1)
        return 0;
        for(int i=2;i*i<n;i++){
            for(int j=i*i;j<n;j=j+i){
                arr[j]=true;
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(arr[i]==false)
            c++;
        }
        return c;
    }
}