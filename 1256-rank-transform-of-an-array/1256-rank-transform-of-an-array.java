class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return arr;
        }
        int [] ar=arr.clone();
        Arrays.sort(arr);
        int[] ans=new int[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],1);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                map.put(arr[i+1],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i+1],map.get(arr[i]));
            }
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(ar[i]);
        }
        return ans;
    }
}