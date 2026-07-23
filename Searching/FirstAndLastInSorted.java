class Solution {
    ArrayList<Integer> find(int arr[], int x) {
int first=-1;
int last=-1;
int left=0; int right=arr.length-1;
while(left<=right){
    int mid=(left+right)/2;
    if(arr[mid]==x){
        first=mid;
        right=mid-1;
    } else if(arr[mid]<x){
        left=mid+1;
    } else{
        right=mid-1;
    }
    
}
left=0;
right=arr.length-1;
while(left<=right){
    int mid=(left+right)/2;
    if(arr[mid]==x){
        last=mid;
        left=mid+1;
    } else if(arr[mid]<x){
        left=mid+1;
    } else{
        right=mid-1;
    }
}
ArrayList<Integer> ans=new ArrayList<>();
ans.add(first);
ans.add(last);

return ans;

    }
}
