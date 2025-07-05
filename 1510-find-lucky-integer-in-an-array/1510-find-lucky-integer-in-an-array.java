class Solution {
    public int findLucky(int[] arr) {
        int [] a= new int[501];
        for(int i=0;i<arr.length;i++){
            a[arr[i]]++;
        }
        for(int i=a.length-1;i>0;i--){
            if(a[i]==i)
            return i;
        }
        return -1;
    }
}