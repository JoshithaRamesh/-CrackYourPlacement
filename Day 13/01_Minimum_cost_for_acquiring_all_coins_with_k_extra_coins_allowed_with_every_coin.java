class Solution  
{ 
    static int minCost(int coin[], int n, int k) 
    { 
        Arrays.sort(coin); 
        int coins_needed = (int)Math.ceil(1.0 * n / (k + 1)); 
        int ans = 0;  
        for (int i = 0; i <= coins_needed - 1;  i++) 
            ans += coin[i]; 
        return ans; 
    } 
}
