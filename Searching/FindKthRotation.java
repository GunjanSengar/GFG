class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int left=0; int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]<=arr[right]){
                right=mid-1;
            } else{
                left=mid+1;
            }
        }
        return left;
    }
}