class Solution {
    public int[] intersection(int[] n1, int[] n2) {
        ArrayList <Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n1.length;i++){
            if(map.containsKey(n1[i])){
                map.put(n1[i],map.get(n1[i])+1);
            }
            else{
                map.put(n1[i],1);
            }
        }
        for(int i=0;i<n2.length;i++){
            if(map.containsKey(n2[i])){
                arr.add(n2[i]);
                map.remove(n2[i]);
            }
        }
        int[] ar = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ar[i] = arr.get(i);
        }
        return ar;
    }
}