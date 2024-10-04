class Solution {
    public long dividePlayers(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0,product=1;
        int ret=a.length/2;
        int p=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
            map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
            sum=sum+a[i];
        }
        if(sum%ret!=0){
            return -1;
        }
        long skill=sum/ret;
        sum=0;
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
            int req=(int)(skill-temp);
            if(map.containsKey(req)){
                if(map.get(req)!=0){
                    product=(long)a[i]*req;
                    sum=sum+product;
                    p++;
                    map.put(req,map.get(req)-1);
                    map.put(a[i],map.get(a[i])-1);
                }

        }
        }
    if(p==ret){
        return sum;
    }
    return -1;
    }
}