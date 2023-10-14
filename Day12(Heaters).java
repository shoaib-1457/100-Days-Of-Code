class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans=0;
        for (int house:houses) ans= Math.max(ans,closestHeater(house,heaters));
        return ans;
    }
    public int closestHeater(int house, int h[]){
        int left=0, right=h.length-1;
        while (right>left+1){
            int mid = left+(right-left)/2;
            if (house < h[mid]) {
                right = mid;
            }
            if (house > h[mid]){
                left = mid;
            }
            if (house == h[mid]){
                return 0;
            }
        }
        return Math.min(Math.abs(h[left]-house),Math.abs(h[right]-house));
    }
}
