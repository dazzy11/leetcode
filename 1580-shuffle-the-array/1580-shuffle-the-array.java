class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr=new int [2*n];
        int i=0,j=0;
        while(j<n){
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
            j++;
            i=i+2;
        }
        return arr;
    }
}