class Solution {
    public int bitwiseComplement(int n) {
//         if(n == 0) return 1;
        
//         int num  = n;
//         int mask = 0;
        
//         while(n != 0){
//             mask = (mask << 1) | 1;
//             num = num >> 1;
//         }
        
//         int ans = (~n) & mask;
//         return  ans;
        
        if( n== 0)return 1;
        int ret=0;
        int i=0;
        
        while(n!=0)
        {
            if(( n & 1) == 0)
            {
                ret |= 1 << i;
            }
            i++;
            n >>= 1;
        }
        
        return ret;
        
    }
}