class Solution {
    public char repeatedCharacter(String s) {
        Set <Character> map=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.contains(s.charAt(i)))
                return s.charAt(i);
            else
            map.add(s.charAt(i));
        }
        return 's';
    }
}