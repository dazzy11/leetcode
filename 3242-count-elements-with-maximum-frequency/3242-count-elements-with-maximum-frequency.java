class Solution {
    public int maxFrequencyElements(int[] nums) {
        int [] arr= new int[101];
        int max=0,count=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            max=Math.max(arr[nums[i]],max);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
                count++;
        }
        return count*max;
    }
}