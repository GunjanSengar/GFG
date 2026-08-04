class Solution {
    int upperBound(int[] arr, int x){
        int left=0;
        int right=arr.length-1;
        int ans=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>x){
                ans=mid;
                right=mid-1;
            } else{
                left=mid+1;
            }
        }
        return ans;
    }
    
    
    public int median(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][cols-1]);
        }
        int required=(rows*cols)/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0;
            for(int i=0;i<rows;i++){
                count+=upperBound(mat[i],mid);
            }
            if(count<=required){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return low;
    }
}