/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *   public:
 *     int get(int index);
 *     int length();
 * };
 */

class Solution {
public:
    int searchFirstHalf(int target, int peak, MountainArray &arr, int n){
        int s = 0; 
        int e = peak;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            int arrmid = arr.get(mid);
            
            if(arrmid == target) return mid;
            else if(arrmid > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return INT_MAX;
    }
    int searchSecondHalf(int target, int peak, MountainArray &arr, int n){
        int s = peak; 
        int e = n-1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            int arrmid = arr.get(mid);
            
            if(arrmid == target) return mid;
            else if(arrmid > target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return INT_MAX;
    }
    int findInMountainArray(int target, MountainArray &arr) {        
        int n = arr.length();
        
        int s = 0, e = n-1;
        
        int peak = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            
            int arrmid = arr.get(mid);
            
            if((mid==0 || arr.get(mid-1) < arrmid) && (mid==n-1 || arrmid > arr.get(mid+1))){
                peak = mid;
                e = mid-1;
            }else if(mid > 0 && arr.get(mid-1) > arr.get(mid)){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        
        int a = searchFirstHalf(target, peak, arr, n);
        int b = searchSecondHalf(target, peak, arr, n);
        
        if(min(a, b) == INT_MAX) return -1;
        
        return min(a, b);
    }
};