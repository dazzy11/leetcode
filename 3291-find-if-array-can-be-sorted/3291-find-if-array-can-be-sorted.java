class Solution {
    public boolean canSortArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count(nums[i],arr,i);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]&&arr[i]!=arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void count(int n,int[] arr,int i){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        arr[i]=count;
    }
}