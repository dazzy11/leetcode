class Solution {
    public int[] closestPrimes(int left, int right) {
        int [] a= new int[]{-1,-1};
        boolean[] sieve=new boolean[right+1];
        Arrays.fill(sieve,true);
        sieve[0]=sieve[1]=false;
        for(int i=2;i*i<=right;i++){
            if(sieve[i]){
                for(int j=i*i;j<=right;j=j+i){
                    sieve[j]=false;
                }
            }
        }
        int lastprime=-1,min=10000000;
        for(int i=right;i>=left;i--){
            if(sieve[i]){
                if(lastprime!=-1){
                    if((lastprime-i)<=min){
                        a[0]=i;
                        a[1]=lastprime;
                        System.out.println(a[0]);
                         System.out.println(a[1]);
                         min=lastprime-i;
                    }
                }
                lastprime=i;
            }
        }
        return a;
    }
}