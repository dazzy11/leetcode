class Solution {
    public int[] findIntersectionValues(int[] n1, int[] n2) {
        HashMap <Integer,Integer> map=new HashMap<>();
        HashMap <Integer,Integer> map1=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<n1.length;i++){
            if(!map.containsKey(n1[i]))
                map.put(n1[i],1);
        }
        for(int i=0;i<n2.length;i++){
            if(!map1.containsKey(n2[i]))
                map1.put(n2[i],1);
        }
        for(int i=0;i<n1.length;i++){
            if(map1.containsKey(n1[i]))
                arr[0]++;
        }
        for(int i=0;i<n2.length;i++){
            if(map.containsKey(n2[i]))
                arr[1]++;
        }
        return arr;
    }
}