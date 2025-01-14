class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] arr=new int[a.length+1];
        int[] ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            arr[a[i]]++;
            arr[b[i]]++;
            ans[i]=count(arr);
        }
        return ans;
    }
    public static int count(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2)
                c++;
        }
        return c;
    }
}