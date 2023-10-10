class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            int ans = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[j] < nums[i] && j!=i){
                    ans++;
                }
            }
            arr[i] = ans;
        }
        return arr;
    }
}
