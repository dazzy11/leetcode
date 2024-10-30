class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
        char[] arr=word.toCharArray();
        for(int i=0,j=n;i<j;i++,j--){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return String.valueOf(arr);
    }
}