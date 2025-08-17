class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2)){
                String s= num.substring(i,i+3);
                int n=Integer.parseInt(s);
                max=Math.max(max,n);
            }
        }
        if(max==0){
            return "000";
        }
        if(max==-1){
            return "";
        }
        return Integer.toString(max);
    }
}