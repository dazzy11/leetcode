class Solution {
    public int[][] merge(int[][] inte) {
        Arrays.sort(inte,(a,b) -> a[0]-b[0]);
        ArrayList<int[]> arr=new ArrayList<>();
        int[] current=inte[0];
        for(int i=1;i<inte.length;i++){
            int[] next=inte[i];
            if(current[1]>=next[0]){
                current[1] = Math.max(current[1], next[1]);
            }
            else{
                arr.add(current);
                current=next;
            }
        }
        arr.add(current);
        return arr.toArray(new int[0][]);
    }
}