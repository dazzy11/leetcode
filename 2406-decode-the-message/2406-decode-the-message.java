class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        String st="";
        int j=0;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' '&& !map.containsKey(key.charAt(i))){
            char c=(char) ('a'+j);
            map.put(key.charAt(i),c);
            j++;
            }
        }
        for(int i=0;i<message.length();i++){
            if(map.containsKey(message.charAt(i))){
            char in=map.get(message.charAt(i));
            st=st+in;
            }
            else{
                st=st+message.charAt(i);
            }
        }
        return st;
    }
}