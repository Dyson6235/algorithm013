class Solution_ugly_number  {
    public int nthUglyNumber(int n) {
        // 动态规划解法u
        int a=0,b=0,c=0;
        int dp[] =  new int[n];
        // 边界条件 dp[0] = 1;
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i] = Math.min(dp[a]*2,Math.min(dp[b]*3,dp[c]*5));
            // 下面是状态转移方程
            if(dp[i]==dp[a]*2) a++;
            if(dp[i]==dp[b]*3) b++;
            if(dp[i]==dp[c]*5) c++;
        }
        return dp[n-1];
    }
}