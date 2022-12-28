class Solution {
    public int sumFourDivisors(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(numAndSumOfDiv(nums[i])[0] == 4){
                answer += numAndSumOfDiv(nums[i])[1];
            }
        }
        return answer;
    }
    
    public int[] numAndSumOfDiv(int n){
        int cnt = 0;
        int sum = 0;
        
        for(int i =1; i*i <= n; i++){
            if(n%i==0){
                cnt++;
                sum+= i;
                
                if(i!=n/i){
                    cnt++;
                    sum+= n/i;
                }
            }
        }
        int[] arr = new int[2];
        arr[0] = cnt;
        arr[1] = sum;
        return arr;
    }
    
}