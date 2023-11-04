class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n/2];
        int arr2[] = new int[n/2];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr1[j]=nums[i];
                j++;
            }else{
                arr2[k]=nums[i];
                k++;
            }
        }
        j=0;k=0;
        for(int i=0;i<n;i++){
            nums[i] = arr2[k];
            k++;
            i++;
            nums[i] = arr1[j];
            j++;
        }
        return nums;
    }
}
