class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     int prod =1;
        //     for(int j =0;j<n;j++){
        //         if(i == j) continue;
        //         prod *= nums[j];
        //     }
        //     arr[i] = prod;
        //     }
        // return arr;
        int n = nums.length;
        int p = 1;
        int s = 1;
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = p;
            p *= nums[i];
        }
        for(int i = n-1; i >= 0; i--) {
            result[i] *= s;
            s *= nums[i];
        }
        return result;
        }
    }
