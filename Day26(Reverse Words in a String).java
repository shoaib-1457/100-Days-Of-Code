class Solution {
    public String reverseWords(String s) {
        String ans="";
        String[] words=s.split("\\s+");
        for(String w : words){
            if(ans==""){
              ans=w;
            } 
            else{
              ans=w+" "+ans;
            } 
        }
        return ans;
    }
}
