class Solution {
    public String reverseVowels(String s) {
        String st="aAeEiIoOuU";
       char [] arr=s.toCharArray();
       int j=arr.length-1;
       int i=0;
        while(i<j){
            if(!st.contains(Character.toString(arr[i]))){
                i++;
            }
            if(!st.contains(Character.toString(arr[j]))){
                j--;
            }
            if(st.contains(Character.toString(arr[j]))&&st.contains(Character.toString(arr[i]))){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}