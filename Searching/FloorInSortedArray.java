class Solution {
    static int findFloor(int[] arr, int x) {
int ans=-1;
int left=0; int right=arr.length-1;
while(left<=right){
    int mid=(left+right)/2;
    
   if(arr[mid]>x){ 
        right=mid-1;
    } else{
     ans=mid;

        left=mid+1;

    }
}
return ans;





    }
}
