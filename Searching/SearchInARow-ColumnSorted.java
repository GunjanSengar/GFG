class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int rows=mat.length;
        int cols=mat[0].length;
        int row=0;
        int col=cols-1;
        while(row<rows && col>=0){
            int current=mat[row][col];
            if(current==x){
                return true;
            } else if(current>x){
                col--;
            } else{
                row++;
            }
        }
        return false;
        
    }
}