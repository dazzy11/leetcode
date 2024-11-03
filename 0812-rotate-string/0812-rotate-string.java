class Solution {
    public boolean rotateString(String s, String goal) {
        char[] a=s.toCharArray();
        int flag=0;
        for(int i=0;i<a.length;i++){
            if(String.valueOf(a).equals(goal)){
            return true;
        }
        char temp=a[0];
        for(int j=0;j<a.length-1;j++){
            a[j]=a[j+1];
        }
        a[a.length-1]=temp;
        }
        return false;
    }
}