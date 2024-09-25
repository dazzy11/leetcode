class Solution {
    public int firstUniqChar(String s) {
        int flag=0;
        if(s.length()==1){
            return 0;
        }
                for(int i=0;i<s.length();i++){
                    flag=0;
                    for(int j=0;j<s.length();j++){
                        if(j!=i){
                        if(s.charAt(i)==s.charAt(j)){
                            flag=1;
                        break;
                        }
                        }
                    }
                    if(flag==0)
                    return i;
                }
                return -1;
    }
}