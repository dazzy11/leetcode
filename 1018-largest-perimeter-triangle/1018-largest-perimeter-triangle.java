class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            if(triangle(nums[i],nums[i-1],nums[i-2])){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
    public boolean triangle(int a,int b,int c){
        if((a+b)>c &&(b+c)>a &&(a+c)>b){
            return true;
        }
        return false;
    }
}