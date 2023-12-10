class Solution {
    public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<Math.pow(2,n);i++){
            int count=0;
            List<Integer> l=new ArrayList<>();

            for(int j=0;j<n;j++){
                if((i>>j)%2==1){
                    count++;
                    l.add(j+1);
                }
            }
            if(count==k){
                ans.add(l);
            }
        }
        return ans;
    }
}
