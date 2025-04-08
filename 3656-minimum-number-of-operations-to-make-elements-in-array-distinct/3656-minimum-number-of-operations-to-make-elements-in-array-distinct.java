class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=0,flag=0;
        for(int i=nums.length-1;i>=0;i--){
          if(set.contains(nums[i])){
            flag=1;
            n=(i)/3;
            break;
          }  
          set.add(nums[i]);
        }
        return flag==1 ? n+1: n ;
    }
}