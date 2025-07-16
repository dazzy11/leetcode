class Solution {
    public int thirdMax(int[] nums) {
        Integer a=null,b=null,c=null;
        for(int num:nums){
            if(Objects.equals(num,a)||Objects.equals(num,b)||Objects.equals(num,c)){
                continue;
            }
            if(a==null||num>a){
                c=b;
                b=a;
                a=num;
            }
            else if(b==null||num>b){
                c=b;
                b=num;
            }
            else if(c==null||num>c){
                c=num;
            }
        }
        return c!=null ? c:a;
    }
}