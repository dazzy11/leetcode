class Solution {
    public int maximumLength(String s) {
        int max=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(valid(sub)){
                    System.out.println(sub);
                max=Math.max(max,spec(sub,s));
                }
            }
        }
        return max;
    }
    public static int spec(String sub,String s){
        int count=0,index=0;
        while((index=s.indexOf(sub,index))!=-1){
            count++;
            index=index+1;
        }
        if(count>=3){
            return sub.length();
        }
        return -1;
    }
    public static boolean valid(String sub){
        char first=sub.charAt(0);
        for(int i=1;i<sub.length();i++){
            if(first!=sub.charAt(i)){
                return false;
            }
        }
        return true;
    }
}