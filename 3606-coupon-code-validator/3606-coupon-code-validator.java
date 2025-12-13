class Solution {
    public List<String> validateCoupons(String[] c, String[] b, boolean[] is) {
        List<String> ans =new ArrayList<>();
        String[] ca={"electronics", "grocery", "pharmacy", "restaurant"};
        for(int j=0;j<ca.length;j++){
             List<String> l =new ArrayList<>();
        for(int i=0;i<b.length;i++){
            if(ca[j].equals(b[i])){
                if(is[i]){
                    if(valid(c[i])){
                        l.add(c[i]);
                    }
                }
            }
        }
        Collections.sort(l);
        ans.addAll(l);
        }
        return ans;
    }
    public boolean valid(String s){
        if (s == null || s.isEmpty()) return false;
        for(char c : s.toCharArray()){
            if(!Character.isLetterOrDigit(c)&& c!='_'){
                return false;
            }
        }
        return true;
    }
}