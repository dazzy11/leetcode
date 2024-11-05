class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String str="1";
        for(int i=2;i<=n;i++){
            int count=1;
            str+="$";
            StringBuilder sb=new StringBuilder();
            for(int j=1;j<str.length();j++){
                if(str.charAt(j)!=str.charAt(j-1)){
                    sb.append(count).append(str.charAt(j-1));
                    count=1;
                }
                else
                    count++;
            }
            str=sb.toString();
        }
        return str;

    }
}