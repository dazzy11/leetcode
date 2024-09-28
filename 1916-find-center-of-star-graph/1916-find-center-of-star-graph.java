class Solution {
    public int findCenter(int[][] e) {
        if(e[0][0]==e[1][0]){
            return e[0][0];
        }
        if(e[0][1]==e[1][0]){
            return e[0][1];
        }
        if(e[0][0]==e[1][1]){
            return e[0][0];
        }
        if(e[0][1]==e[1][1]){
            return e[0][1];
        }
    return e[0][0];
    }
}