class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) a.add(nums[i]);
        Collections.sort(a);
        for(int i=0;i<nums.length;i=i+2) nums[i]=a.remove(0);
        for(int i=1;i<nums.length;i=i+2) a.add(nums[i]);
        Collections.sort(a);
        for(int i=1;i<nums.length;i=i+2) nums[i]=a.remove(a.size() - 1);
        return nums;
    }
}