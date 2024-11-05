class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");
        for(int i=0;i<Math.max(arr1.length,arr2.length);i++){
            int a= i<arr1.length ? Integer.valueOf(arr1[i]) :0;
            int b= i<arr2.length ? Integer.valueOf(arr2[i]) :0;
            if(a<b){
                return -1;
            }
            else if(a>b){
                return 1;
            }
        }
        return 0;
    }
}