class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        if(m==0&&n==1){
            if(num1[0]<num2[0])
            num1[0]=num2[0];
        }
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i >= 0 && num1[i]>=num2[j]){
                num1[k]=num1[i];
                i--;
                k--;
            }
            else{
                num1[k]=num2[j];
                j--;
                k--;
            }
        }
    }
}