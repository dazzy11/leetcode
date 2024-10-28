class Solution {
    public String interpret(String c) {
        c=c.replace("()","o");
        c=c.replace("(al)","al");
        return c;
    }
}