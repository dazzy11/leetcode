class Solution {
    public int mostFrequentEven(int[] n) {
        HashMap <Integer,Integer> map=new HashMap<>();
        Arrays.sort(n);
        int max=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                if(map.containsKey(n[i]))
                    map.put(n[i],map.get(n[i])+1);
                else
                    map.put(n[i],1);
            }
        }
        for(int i=0;i<n.length;i++){
            Integer val=map.get(n[i]);
             if (val != null)
            max=Math.max(max,val);
        }
        for(int i=0;i<n.length;i++){
            Integer va=map.get(n[i]);
             if (va != null) {
            if(va==max)
                return n[i];
             }
        }
        return -1;
    }
}