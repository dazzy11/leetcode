class Solution {
    public int countConsistentStrings(String all, String[] w) {
        int c=0;
        for(int j=0;j<w.length;j++){
            for(int i=0;i<w[j].length();i++){
                if(all.indexOf(w[j].charAt(i))==-1){
                c++;
                break;
                }
            }
        }
        return w.length-c;
    }
}