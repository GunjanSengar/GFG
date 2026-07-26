class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        long total=m*k;
if(total >arr.length){
return -1;
}
int left=0; int right=0;
for(int i=0;i<arr.length;i++){
    left=Math.min(left,arr[i]);
    right=Math.max(right,arr[i]);
    
}
int ans=-1;
while(left<=right){
    int mid=left+(right-left)/2;
    int bouquet=0;
    int flowers=0;
    for(int i=0;i<arr.length;i++){
    if(arr[i]<=mid){
        flowers++;
        if(flowers==k){
            bouquet++;
            flowers=0;
        }
    }
    else{
        flowers=0;
    }
}
if(bouquet>=m){
    ans=mid;
    right=mid-1;
}
else{
    left=mid+1;
}
}

return ans;


    }
}