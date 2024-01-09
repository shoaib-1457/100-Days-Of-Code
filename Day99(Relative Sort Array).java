class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int a = 0, b = 0;
       int n = arr2.length;
       while(b < n){
        a = swap(arr1, arr2[b++], a);
       }
        Arrays.sort(arr1,a, arr1.length);
        return arr1;
    }
    int swap(int[] arr, int target, int ans){
       for(int i = ans; i < arr.length; i++){
         if(arr[i] == target){
                int temp = arr[ans];
                arr[ans++] =  arr[i];
                arr[i] = temp;
            }
       }
       return ans;
    }
}
