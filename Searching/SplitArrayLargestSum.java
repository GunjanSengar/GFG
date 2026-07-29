class Solution {
    public int splitArray(int[] arr, int k) {
        int left=0; int right=0;
        for(int i=0;i<arr.length;i++){
            left=Math.max(left,arr[i]);
            right+=arr[i];
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int subarrays=1;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(sum+arr[i]<=mid){
                    sum+=arr[i];
                } else{
                    subarrays++;
                    sum=arr[i];
                }
            }
            if(subarrays<=k){
                ans=mid;
                right=mid-1;
                
            } else{
                left=mid+1;
            }
            
        }
        return ans;
        
    }
};