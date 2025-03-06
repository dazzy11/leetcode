class Solution {
    public int[] findMissingAndRepeatedValues(int[][] g) {
            int [] a =new int[2];
            HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g.length;j++){
                if(map.containsKey(g[i][j]))
                    a[0]=g[i][j];
                else
                map.put(g[i][j],1);
            }
        }
        for(int i=1;i<=(g.length*g.length);i++){
            if(!map.containsKey(i))
            a[1]=i;
        }
        return a;
    }
}