class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [] so=nums.clone();
        Arrays.sort(so);
        int [] a =new int [k];
         int m=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums.length-k;i<nums.length;i++){
            map.put(so[i],map.getOrDefault(so[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&map.get(nums[i])>0){
                a[m]=nums[i];
                m++;
                map.put(nums[i],map.get(nums[i])-1);
            }
        }
        return a;
    }
}