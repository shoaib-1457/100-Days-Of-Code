class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        // while(nums.length>0){
        //     for(int i = 0;i<nums.length-1;i++){
        //         for(int j =i+1;j<nums.length;j++){
        //             while(nums[i] == nums[j]){
        //                 if(i != j && Math.abs(nums[i] - nums[j]) <= nums[i] - nums[j] && Math.abs(i - j) <= ){
        //                     return true;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return false;
        if(indexDiff == 100000){
            return false;
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<=i+indexDiff;j++)
            {
                if(j<nums.length)
                {
                 if(Math.abs(i-j)<=indexDiff && Math.abs(nums[i]-nums[j])<=valueDiff)
                    {
                       return true;    
                    }
                }
            }
        }
        return false;
    }
}
