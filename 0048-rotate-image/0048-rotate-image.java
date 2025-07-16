class Solution {
    public void rotate(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m.length;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<m.length;i++){
            int left=0,right=m.length-1;
            while(left<right){
                int t=m[i][left];
                m[i][left]=m[i][right];
                m[i][right]=t;
                left++;
                right--;
            }
        }

    }
}