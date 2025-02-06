class Solution {
    public String triangleType(int[] nums) {
        if((nums[0]==nums[1])&&(nums[1]==nums[2])){
            return "equilateral";
        }
        if(tri(nums)&&iso(nums)){
            return "isosceles";
        }
        if(tri(nums)){
            return "scalene";
        }
        return "none";
    }
    public static boolean iso(int [] nums){
        return ((nums[0]==nums[1])||(nums[0]==nums[2])||(nums[1]==nums[2]));
    }
    public static boolean tri(int [] nums){
        return ((nums[0] + nums[1]>nums[2])&&(nums[0] + nums[2] >nums[1])&&(nums[1] + nums[2]>nums[0]));
    }
}