class Solution {
    public int distMoney(int money, int children) {
        if(money < children){
            return -1;
        }
        if(money <= 8){
            return 0;
        }
        int[] arr = new int[children];
        for(int i = 0 ; i < children ;i++){
            arr[i] = 1;
            money--;
        }
        int ans = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(money-7 >= 0){
                ans++;
                money-=7;
            }
            else if(money > 0){
                if(money == 3 && i == arr.length-1){
                    return ans-1;
                }
                else{
                    arr[i] = money;
                    money = 0;
                }
            }
        }
        if(money > 0){
            ans--;
        }
        return ans; 
    }
}
