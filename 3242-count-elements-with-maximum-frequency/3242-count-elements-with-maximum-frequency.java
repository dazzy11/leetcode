class Solution {
    public int maxFrequencyElements(int[] n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0,sum=0;
        for(int i=0;i<n.length;i++){
            if(map.containsKey(n[i]))
                map.put(n[i],map.get(n[i])+1);
            else
                map.put(n[i],1);
            max=Math.max(max,map.get(n[i]));
        }
        for(int i=0;i<n.length;i++){
            if(map.get(n[i])==max){
                sum+=max;
                map.put(n[i],0);
            }
        }
        return sum;
    }
}