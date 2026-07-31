class Solution {
    public int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
            
        }
        long left=0; long right=0;
        for(int i=0;i<arr.length;i++){
            left=Math.max(left,(long)arr[i]);
            right+=arr[i];
        }
        long ans=right;
        while(left<=right){
            long mid=left+(right-left)/2;
            int pages=0;
            int students=1;
            for(int i=0;i<arr.length;i++){
                if(pages+arr[i]<=mid){
                    pages+=arr[i];
                    
                } else{
                    students++;
                    pages=arr[i];
                }
            }
            if(students<=k){
                ans=mid;
                right=mid-1;
            } else{
                left=mid+1;
            }
        }
        return (int) ans;
        
    }
}