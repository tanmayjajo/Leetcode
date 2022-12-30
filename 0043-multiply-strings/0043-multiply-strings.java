import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger A = new BigInteger("0");
        BigInteger B = new BigInteger("0");
        
        int i = 0;
        while(i < num1.length()){
            A = A.multiply(BigInteger.valueOf(10));
            A = A.add(BigInteger.valueOf(num1.charAt(i) - '0'));
            i++;
        }
        
        
        int j = 0;
        while(j < num2.length()){
            B = B.multiply(BigInteger.valueOf(10));
            B = B.add(BigInteger.valueOf(num2.charAt(j) - '0'));
            j++;
        }
    
        return A.multiply(B).toString();
    }
}