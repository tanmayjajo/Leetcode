class Solution {
public:
    bool judgeSquareSum(int c) {
        long s = 0, e = sqrt(c);
        while(s <= e){
            long cur = s*s + e*e;
            if(cur < c){
                s++;
            }else if(cur > c){
                e--;
            }else{
                return true;
            }
        }
        return false;
    }
};
