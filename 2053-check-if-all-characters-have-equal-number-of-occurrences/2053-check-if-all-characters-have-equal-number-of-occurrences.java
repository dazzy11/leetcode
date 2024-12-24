class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        int z=0;
        for(int i=0;i<s.length();i++){
            int a=(int)s.charAt(i)-97;
            arr[a]++;
             z=arr[a];
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                continue;
            }
            else{
                if(arr[i]!=z){
                    return false;
                }
            }
        }
        return true;
    }
}