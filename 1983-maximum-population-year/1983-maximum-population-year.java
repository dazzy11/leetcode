class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] arr=new int[100];
        for(int i=0;i<2050;i++){
            for(int j=0;j<logs.length;j++){
            if((logs[j][0]<=i)&&(logs[j][1]>i)){
                arr[i-1950]++;
            }
            }
        }
        int max=0,temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                temp=i;
            }
        }
        return temp+1950;
    }
}