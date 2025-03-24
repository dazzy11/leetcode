class Solution {
    public List<Integer> findWordsContaining(String[] w, char x) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<w.length;i++){
            if(w[i].indexOf(x)>=0)
            l.add(i);
        }
        return l;
    }
}