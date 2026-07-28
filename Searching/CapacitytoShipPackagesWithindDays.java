class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int D) {
        int left=0; int right=0;
        for(int i=0;i<arr.size();i++){
            left=Math.max(left,arr.get(i));
            right+=arr.get(i);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int currentWeight=0;
            int requiredDays=1;
            for(int i=0;i<arr.size();i++){
                if(currentWeight+arr.get(i)<=mid){
                    currentWeight+=arr.get(i);
                } else{
                    requiredDays++;
                    currentWeight=arr.get(i);
                }
            }
            if(requiredDays<=D){
                ans=mid;
                right=mid-1;
            } else{
                left=mid+1;
            }
            
        }
        return ans;
            

    }
}