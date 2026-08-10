class Solution {
    public int lastWordLen(String s) {
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        int count=0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;   
        
    }
}