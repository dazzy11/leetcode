class Solution {
    public String defangIPaddr(String s) {
        return s.replace(".","[.]");
    }
}