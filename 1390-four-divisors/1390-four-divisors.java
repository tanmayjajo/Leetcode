class Solution {
    public int sumFourDivisors(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(numOfDiv(nums[i]) == 4){
                answer += sumOfDiv(nums[i]);
            }
        }
        return answer;
    }
    
    public int numOfDiv(int n){
        int cnt = 0;
        for(int i =1; i*i <= n; i++){
            if(n%i==0){
                cnt++;
                if(i!=n/i){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public int sumOfDiv(int n){
        int sum = 0;
        for(int i =1; i*i <= n; i++){
            if(n%i==0){
                sum+= i;
                if(i!=n/i){
                    sum+= n/i;
                }
            }
        }
        return sum;
    }
    
    
    
    
}