class Solution {
    public int nthRoot(int n, int m) {
        if(m==0){
            return 0;
        }
int left=1; int right=m;
while(left<=right){
    int mid=left+(right-left)/2;
    long result=1;
    for(int i=0;i<n;i++){
        result=result*mid;
        
        if(result>m){
            break;
        }
    }
    if(result==m){
        return mid;
    } else if(result<m){
        left=mid+1;
    }
    else{
        right=mid-1;
    }
}
return -1;



    }
}