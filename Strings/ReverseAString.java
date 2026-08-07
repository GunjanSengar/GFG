class Solution {
    public static String reverseString(String s) {
        // char[] arr=s.toCharArray();
        // int left=0; int right=s.length()-1;
        // while(left<right){
        //     char ch=arr[left];
        //     arr[left]=arr[right];
        //     arr[right]=ch;
        //     left++;
        //     right--;
        // }
        // return new String(arr);
        
        StringBuilder sb=new StringBuilder(s);
        
        return sb.reverse().toString();
        
    }
}