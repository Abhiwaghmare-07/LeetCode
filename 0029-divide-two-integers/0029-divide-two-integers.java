class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long number = Math.abs((long) dividend);
        long div = Math.abs((long) divisor);
        long ans = 0;

        while (number >= div) {
            int cnt = 0;

            while (number >= (div << (cnt + 1))) {
                cnt++;
            }

            ans += (1L << cnt);
            number -= (div << cnt);
        }

        if ((dividend < 0) ^ (divisor < 0))
            ans = -ans;

        return (int) ans;
    }
}