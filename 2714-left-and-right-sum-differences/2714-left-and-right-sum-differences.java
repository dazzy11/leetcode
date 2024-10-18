class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr=new int[nums.length];
        int[] arr2=new int[nums.length];
        arr[0]=0;
        for(int i=0;i<nums.length-1;i++){
            int temp=nums[i];
            arr[i+1]=temp+arr[i];
        }
        for(int i=nums.length-1;i>0;i--){
            int temp=nums[i];
            arr2[i-1]=temp+arr2[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(arr[i]-arr2[i]);
        }
        return arr;
    }
}