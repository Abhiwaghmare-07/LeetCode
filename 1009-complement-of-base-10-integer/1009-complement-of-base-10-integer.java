class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int ans = 0;
        int i = 0;
       while( n > 0){
        int bit = (n & 1);
        bit = bit == 0 ? 1 : 0;
        if(bit == 1){
            ans += (1 << i);
        }
         n = n>>1;
        i++;
       }

       return ans;
    }
}