class Solution {
    public void rotate(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m[0].length;j++){
                int t=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=t;
            }
        }
         for(int i=0;i<m.length;i++){
          reverse(m[i]);
         }
    }
    public void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
    }
}