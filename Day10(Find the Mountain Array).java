/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int s = 1;
        int e = mountainArr.length()-2;
        int in = 0;
     // find peak element 
        while(s<=e){
            int mid = s+(e-s)/2;
            int a = mountainArr.get(mid);
            int b = mountainArr.get(mid-1);
            int c = mountainArr.get(mid+1);
            if(a>b&&a<c) s = mid+1;
            else if(a<b&&a>c) e = mid-1;
            else if(a>=b&&a>=c) {
                in = mid;
                break;
            }
        }
     // search in first sorted half
        s = 0;
        e = in;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mountainArr.get(mid)<target) s = mid+1;
            else if(mountainArr.get(mid)>target) e = mid-1;
            else {
                return mid;
            }
        }
         s = in;
         e = mountainArr.length()-1 ;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mountainArr.get(mid)>target) s = mid+1;
            else if(mountainArr.get(mid)<target) e = mid-1;
            else {
                return mid;
            }
        }
        return -1;
    }
}
