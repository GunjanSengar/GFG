class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int left=0;
        int right=cols-1;
         ArrayList<Integer> ans=new ArrayList<>();

        while(left<=right){
            int mid=left+(right-left)/2;
            int maxRows=0;
            for(int i=1;i<rows;i++){
                if(mat[i][mid]>mat[maxRows][mid]){
                    maxRows=i;
                }
            }
            int leftValue=(mid==0)? Integer.MIN_VALUE : mat[maxRows][mid-1];
            int rightValue=(mid==cols-1) ? Integer.MIN_VALUE: mat[maxRows][mid+1];
            
            if(leftValue<=mat[maxRows][mid] && rightValue<=mat[maxRows][mid]){
                ans.add(maxRows);
                ans.add(mid);
                return ans;
            }
         else if(leftValue>mat[maxRows][mid]){
            right=mid-1;
        } else{
            left=mid+1;
        }
        
    }
    ans.add(-1);
        ans.add(-1);
        return ans;
    }
}