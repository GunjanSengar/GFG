class Solution {
    int smallestDivisor(int[] arr, int k) {
        int left=1; int right=0;
        for(int i=0;i<arr.length;i++){
            right=Math.max(right,arr[i]);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=(arr[i]+mid-1)/mid;
            }
            if(sum<=k){
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