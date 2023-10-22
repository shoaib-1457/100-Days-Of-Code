class Solution {
    public String frequencySort(String s) {
    char[] arr = new char[256];
    for(int i=0; i<s.length(); i++){
        arr[s.charAt(i)]++;    
    }
    
    StringBuilder sb = new StringBuilder();
    int max = -1;
    while(max != 0){
        max = -1;
        char ans = 0;
        for(char i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                ans = i;
            }
        }
        for(int i=0; i<max; i++){
            sb.append(ans);   
        }
        arr[ans] = 0;
    }
    return sb.toString();    
    }
}
