class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
            max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            int curr=candies[i]+extraCandies;
            if(curr>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;  
    }
}
