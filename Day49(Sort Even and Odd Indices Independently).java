class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] even = new int[(n + 1) / 2];
        int[] odd = new int[n / 2];
        int E = 0;
        int O = 0;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                even[E++] = nums[i];
            } else {
                odd[O++] = nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);
        E = 0;
        O = n / 2 - 1;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                nums[i] = even[E++];
            } else {
                nums[i] = odd[O--];
            }
        }

        return nums;
    }
}
