class Solution {
    public int maxSum(int[] nums) {
        boolean check=false;
        int n=-101;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                check=true;
                break;
            }
            if(n<nums[i])
            n=nums[i];
        }
        System.out.println(n);
        if(check==false){
            return n;
        }
        Set<Integer> s=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
        s.add(nums[i]);
            }
        }
        int sum=0;
        for(int t:s){
            sum+=t;
        }
        return sum;
    }
}