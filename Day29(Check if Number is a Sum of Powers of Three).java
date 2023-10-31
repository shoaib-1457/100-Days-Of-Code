class Solution {
    public boolean checkPowersOfThree(int n) {
    if(n==0){
        return true;
        }
        int x = n%3;
        if(x==2){
            return false;
        }
        return checkPowersOfThree(n/3);
    }
}
