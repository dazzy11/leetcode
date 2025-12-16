class Solution {
    public int countPartitions(int[] nums) {
        int [] arr =new int[nums.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        sum=0;
        int c=0;
        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
        for(int i=nums.length-1;i>0;i--){
            sum+=nums[i];
            int val=Math.abs(sum-arr[i-1]);
            if(val%2==0)
            c++;
        }
        return c;
    }
}