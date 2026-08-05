class Solution {
    public boolean search(int[] arr, int key) {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                return true;
            } 
            if(arr[mid]>=arr[left]){
            if(arr[left]<=key && key<arr[mid]){
                right=mid-1;
            } else{
                left=mid+1;
            }
            } else{
                if(key>arr[mid] && key<arr[right]){
                    left=mid+1;
                } else{
                    right=mid-1;
                }
            }
        }
        return false;
        
    }
}
