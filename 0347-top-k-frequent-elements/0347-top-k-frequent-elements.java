class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        int[] arr=new int[k];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            p.add(entry.getValue());
        }
        for(int i=0;i<k;i++){
            int n=p.poll();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(n)) {
                int keyFound = entry.getKey();
                arr[i]=keyFound;
                map.put(keyFound,0);
                break; // Stop if found
            }
        }
        }
        return arr;
    }
}