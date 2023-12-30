class Solution {
    public int findMaxLength(int[] nums) {
        // int ans = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int zeros = 0, ones = 0;
        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] == 0){
        //             zeros++;
        //         } 
        //         else{
        //             ones++;
        //         }
        //         if(zeros == ones){
        //             ans = Math.max(ans, j - i + 1);
        //         }
        //     }
        // }
        // return ans;  

        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i <nums.length; ++i) {
           sum += nums[i] == 1 ? 1 : -1;
           if (map.containsKey(sum)) {
               maxLen = Math.max(maxLen, i - map.get(sum));
           } else {
               map.put(sum, i);
           }
        }
        return maxLen;
    }
}
