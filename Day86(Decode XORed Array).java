class Solution {
    public int[] decode(int[] encoded, int first) {
        int arr[]=new int[encoded.length+1];
        arr[0]=first;
        int index=0;
        for(int i=0;i<encoded.length;i++){
            int ans=arr[index++]^encoded[i];
            arr[index]=ans;
        }
        return arr; 
    }
}
