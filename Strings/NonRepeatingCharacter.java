class Solution {
    public char nonRepeatingChar(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        } 
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '$';
        
    }
}
