class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        num=0;
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'&&flag==0){
                num=(num*10)+9;
                flag=1;
            }
            else if(s.charAt(i)=='9'){
                num=(num*10)+9;
            }
            else{
                num=(num*10)+6;
            }
        }
        return num;
    }
}