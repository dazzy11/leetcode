class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) { 
        int m=num1.length;
        int n=num2.length,mid=0;
        double sum=1000;
        double[] arr=new double[n+m];
        for(int i=0;i<m;i++)
                arr[i]=num1[i];
        for(int i=0;i<n;i++)
            arr[m+i]=num2[i];
        Arrays.sort(arr);
        mid=(m+n)/2;
        if((m+n)%2!=0){
            sum=arr[mid];
        }
        else{
            sum=(arr[mid-1]+arr[mid])/2;
        }
        return sum;
    }
}