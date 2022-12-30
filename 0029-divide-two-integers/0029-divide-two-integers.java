class Solution {
    public int divide(int dividend, int divisor) {
        boolean isNeg = false;
        
        long dvsr = divisor; 
        long dvdnd = dividend;
        
    
        if(dvdnd < 0 && dvsr > 0){
            isNeg = true;
            dvdnd = dvdnd * (-1);
        }else if(dvdnd > 0 && dvsr < 0){
            isNeg = true;
            dvsr = dvsr * (-1);
        }
        System.out.println(isNeg);
        long ans = dvdnd/dvsr;
        
        if(ans>Integer.MAX_VALUE){
            if(isNeg) return (-1)*Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        if(ans<Integer.MIN_VALUE){
            if(isNeg) return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
        if(isNeg){
            return (int)((-1)*(ans));
        }
        return (int)(ans);
    }
}