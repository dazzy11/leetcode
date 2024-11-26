import java.util.Map;
class Solution {
    public int findChampion(int n, int[][] edges) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int ret=-10,count=0;
        for(int i=0;i<n;i++){
            map.put(i,0);
        }
        for(int i=0;i<edges.length;i++){
            map.put(edges[i][1],map.get(edges[i][0])+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==0){
                ret=entry.getKey();
                count++;
            }
            if(count>1){
                return -1;
            }
        }
        return ret;
    }
}