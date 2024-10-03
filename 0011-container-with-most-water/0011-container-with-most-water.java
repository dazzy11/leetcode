class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int j=h.length-1,i=0;
        while(i<j){
            int min=Math.min(h[i],h[j]);
            int sum=min*(j-i);
            max=Math.max(max,sum);
            if(h[i]<h[j])
                i++;
            else
                j--;
        }
        return max;
    }
}