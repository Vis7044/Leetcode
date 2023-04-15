class Solution {
public:
    int divide(int dividend, int divisor) {
        if(dividend==INT_MIN && divisor==-1) return INT_MAX;
        if(dividend==INT_MIN && divisor==1) return INT_MIN;
        long long i=0;
        if(divisor==1) return dividend;
        if(divisor==-1) return -dividend;
        for(;i<=abs(dividend);i++){
            if(abs(divisor)*i==abs(dividend)){
                break;
            }
            if(abs(divisor)*i>abs(dividend)){
                i--;
                break;
            }
        }

        if((divisor<0 && dividend>0) || (divisor>0 && dividend<0)) return -i;
        return i;

    }
};