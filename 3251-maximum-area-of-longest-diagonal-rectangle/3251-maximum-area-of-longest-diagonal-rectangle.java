class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int area= 0;
        double max=0;
        for(int i=0;i<d.length;i++){
            double dia=Math.sqrt((d[i][0]*d[i][0])+(d[i][1]*d[i][1]));
            if(dia>max){
            max=dia;
            area=d[i][0]*d[i][1];
            }
            if(dia==max)
            area=Math.max(area,d[i][0]*d[i][1]);
        }
        return area;
    }
}