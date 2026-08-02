class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n=a.length;
        int m=b.length;
        if(n>m)
            return kthElement(b,a,k);
            int left=Math.max(0,k-m);
            int right=Math.min(k,n);
            while(left<=right){
                int cut1=left+(right-left)/2;
                int cut2=k-cut1;
                int l1=(cut1==0)? Integer.MIN_VALUE:a[cut1-1];
             int l2=(cut2==0)? Integer.MIN_VALUE:b[cut2-1];
             int r1=(cut1==n)? Integer.MAX_VALUE:a[cut1];
             int r2=(cut2==m)? Integer.MAX_VALUE:b[cut2];
             
             if(l1<=r2 && l2<=r1){
                 return Math.max(l1,l2);
             }
             else if(l1>l2){
                 right=cut1-1;
             }
             else{
                 left=cut1+1;
             }

                
            }
            return -1;
        
        
    }
}