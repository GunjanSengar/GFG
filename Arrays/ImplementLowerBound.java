class Solution {
    int lowerBound(int[] arr, int target) {
        int ans=arr.length; int left=0; int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=target){
                ans=mid;
                right=mid-1; 
            }
            else{
                left=mid+1;
            }
        }
        return ans;
        
    }
}
