class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
         boolean check=false;
        while(true){
            int temp=get(n);
            if(temp==1){
                return true;
            }
            if (map.containsKey(temp)) {
                return false;
            }
            map.put(temp, 0);
            n = temp;
        }
    }
    public static int get(int m){
        int sum=0;
        while(m>0){
            int digit = m % 10;
            sum += digit * digit;
            m = m / 10;
        }
        return sum;
    }
}