class Solution {
    public int smallestNumber(int n) {
        int [] arr= {2,4,8,16,32,64,128,256,512,1024};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                return arr[i]-1;
            }
        }
        return -1;
    }
}