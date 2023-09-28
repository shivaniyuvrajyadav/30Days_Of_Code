class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if (N == 1) return 0;
        long ans = 1;
        for (long i = 2; i*i <= N; i++) {
            if (N % i == 0) {
                ans += i;
                ans += N/i;
                
            }
        }
        if(N == ans) return 1;
        else return 0;
    }
};
