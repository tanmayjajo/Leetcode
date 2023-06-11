class Solution {
public:
    bool check(int speed, vector<int>& dist, double hour){
        int n = dist.size();
        double time = 0;
        for(int i = 0; i < n-1; i++){
            time += ceil((1.0*dist[i])/speed);
        }
        time += (1.0*dist[n-1])/speed;
        
        if(time > hour)  return false;
        return true;
        
        // time += (dist[dist.size()-1]*1.0/speed);
    }
    int minSpeedOnTime(vector<int>& dist, double hour) {
        int minS = 1;
        int maxS = 10000001;
        
        int ans = -1;
        while(minS <= maxS){
            int mid = minS + (maxS - minS)/2;
            if(check(mid, dist, hour)){
                ans = mid;
                maxS = mid-1;
            }else{
                minS = mid+1;
            }
        }
        return ans;
    }
};