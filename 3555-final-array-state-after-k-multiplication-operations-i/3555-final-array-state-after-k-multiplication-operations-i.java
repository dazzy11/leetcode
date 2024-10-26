class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        // HashMap<Integer,Integer> map= new Hashmap<>();
        // PriorityQueue pq=new PriorityQueue<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(i,nums[i]);
        //     pq.add(nums[i]);
        // }
        // for(int i=0;i<k;i++)

        // }
        int[] so=nums.clone();
        for(int j=0;j<k;j++){
            Arrays.sort(so);
            for(int i=0;i<nums.length;i++){
                if(nums[i]==so[0]){
                    nums[i]=so[0]*m;
                    so[0]=so[0]*m;
                    break;
                }
            }
        }
        return nums;
    }
}