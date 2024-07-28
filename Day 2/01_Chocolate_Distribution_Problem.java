class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        long res = Long.MAX_VALUE;
        Collections.sort(a);
        for(int i =0; i<n-m+1; i++){
            int min = a.get(i);
            int max = a.get(i+m-1);
            res = (long)Math.min(res, max-min);
        }
        return res; 
    }
}
