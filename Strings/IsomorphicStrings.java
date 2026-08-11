class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        if(s1.length() !=s2.length()){
            return false;
        }
        HashMap<Character, Character> mapST=new HashMap<>();
        HashMap<Character, Character> mapTS=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if(mapST.containsKey(a) && mapST.get(a)!=b){
                return false;
            }
            if(mapTS.containsKey(b) && mapTS.get(b)!=a){
                return false;
            }
            mapST.put(a,b);
            mapTS.put(b,a);
        }
        return true;
    }
}