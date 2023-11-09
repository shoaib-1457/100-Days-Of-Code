class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
    int ans =Math.max(Math.abs(fx-sx),Math.abs(fy-sy));
        if(ans <=t){
            if(ans ==0 && t==1){
                return false;
            }
            return true;
        }
        return false;  
    }
}
