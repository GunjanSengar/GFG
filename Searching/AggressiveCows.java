class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int left=0; 
        int right=arr[arr.length-1]-arr[0];
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canPlace(arr,k,mid)){
                ans=mid;
                left=mid+1;
            }
            else
            right=mid-1;
            
        }
        return ans;
        
    }
    public static boolean canPlace(int[] stalls, int k, int distance){
        int cows=1;
        int lastPosition=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPosition>=distance){
                cows++;
                lastPosition=stalls[i];
                if(cows==k)
                return true;
                
            }
        }
        return false;
    }
}