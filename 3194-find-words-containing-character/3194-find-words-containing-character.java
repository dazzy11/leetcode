class Solution {
    public List<Integer> findWordsContaining(String[] w, char x) {
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<w.length;i++){
            if(w[i].contains(String.valueOf(x)))
                arr.add(i);
        }
        return arr;
    }
}