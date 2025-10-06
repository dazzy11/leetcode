class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length-1,min=0;
        int max=0;
        while(i<j){
            if(h[i]<h[j]){
                min=h[i];
                i++;
            }
            else{
                min=h[j];
                j--;
            }
            int area=min*(j-i+1);
            max=Math.max(max,area);
        }
        return max;
    }
}