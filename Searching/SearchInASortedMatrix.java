class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int rows=mat.length;
        int cols=mat[0].length;
        int left=0;
        int right=rows*cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(mat[row][col]==x){
                return true;
            } else if(mat[row][col]<x){
                left=mid+1;
            } else{
                right=mid-1;
            }
        }
        return false;
        
    }
}
