class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            if(s.length()%2==0){
                int j=0,k=s.length()-1,sum1=0,sum2=0;
                while(j<k){
                    sum1+=(int) s.charAt(j);
                    sum2+=(int) s.charAt(k);
                    j++;
                    k--;
                }
                if(sum1==sum2)
                count++;
            }
        }
        return count;
    }
}