class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(check(nums[i],nums,i)){
                c++;
                System.out.println(nums[i]+" "+i);
            }
        }
        return c;
    }
    public static boolean check(int n,int[] arr,int ind){
        int m=0,k=0;
        for(int i=ind-1;i>=0;i--){
            if(arr[i]!=n){
                m=arr[i];
                break;
            }
        }
        for(int i=ind+1;i<arr.length;i++){
            if(arr[i]!=n){
                k=arr[i];
                break;
            }
        }
        if(m>n&&k>n){
            return true;
        }
        if(k>0&&m<n&&k<n){
            return true;
        }
        return false;
    }
}