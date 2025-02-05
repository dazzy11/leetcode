class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] arr=s2.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                String str = String.valueOf(arr);
                if(s1.equals(str))
                return true;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return false;
    }
}