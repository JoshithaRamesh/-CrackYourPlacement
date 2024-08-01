class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        long c[]=new long[n];
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            c[n-i-1]=b[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]+c[i]>=k){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
