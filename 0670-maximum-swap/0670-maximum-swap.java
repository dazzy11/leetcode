class Solution {
    public int maximumSwap(int num) {
         String numberStr = Integer.toString(num);
        int[] arr = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            arr[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        int l=numberStr.length();
        for(int i=0;i<l;i++){
            int swap=maxi(arr,i,l);
            if(arr[swap]>arr[i]){
                int temp=arr[swap];
                 arr[swap]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
        }
        return sum;
    }
    public int maxi(int[] arr,int startindex,int l){
        int index=startindex;
        if(startindex<l){
        int max=arr[startindex];
        for(int i=startindex;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
                index=i;
            }
        }
        }
        return index;
    }

}