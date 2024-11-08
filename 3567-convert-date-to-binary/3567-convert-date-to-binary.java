class Solution {
    public String convertDateToBinary(String date) {
        String[] st=date.split("-");
        String ans="";
        for(int i=0;i<st.length;i++){
            int n=Integer.parseInt(st[i]);
            String binary = Integer.toBinaryString(n);
            ans=ans+binary;
            if(i<st.length-1)
                ans=ans+"-";
        }
        return ans;
    }
}