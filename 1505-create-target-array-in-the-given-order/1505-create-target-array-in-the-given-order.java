class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            n.add(index[i],nums[i]);
        int[] res = new int[n.size()];
        for(int i=0;i<nums.length;i++)
            res[i]=n.get(i);
            return res;
    }
}