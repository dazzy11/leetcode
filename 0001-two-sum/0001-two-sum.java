class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)&&i!=map.get(comp)){
                return new int[]{i,map.get(comp)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}