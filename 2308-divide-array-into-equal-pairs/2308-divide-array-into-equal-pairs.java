class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr=new int[501];
        for(int i=0;i<nums.length;i++)
            arr[nums[i]]++;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
            return false;
        }
        return true;
    }
}