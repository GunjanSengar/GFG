class Solution {
    public int minTime(int[] arr, int k) {

 int left=0; int right=0;
for(int i=0;i<arr.length;i++){
    left=Math.max(left,arr[i]);
    right+=arr[i];
}
int ans=right;
while(left<=right){
    int mid=left+(right-left)/2;
    int currentTime=0;
    int requirePainters=1;
    for(int i=0;i<arr.length;i++){
        if(currentTime+arr[i]<=mid){
            currentTime+=arr[i];
        } else{
            requirePainters++;
            currentTime=arr[i];
        }
    }
    if(requirePainters<=k){
        ans=mid;
        right=mid-1;
    } else{
        left=mid+1;
    }
    
   }
   return ans;

    }
    
}
