class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i]))
                map.put(nums1[i],1);

        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])&&map.get(nums2[i])==1){
                map.put(nums2[i],2);
                arr.add(nums2[i]);
            }
        }
        int [] ar=new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) 
            ar[i] = arr.get(i);
        return ar;
    }
}