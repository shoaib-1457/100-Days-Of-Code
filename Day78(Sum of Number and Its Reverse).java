class Solution {
    public boolean sumOfNumberAndReverse(int num){
        for(int i = 0; i <= num; i++){
            int a = i;
            int value1 = i;
            int value2 = 0;
            while (a > 0) {
                value2 = value2 * 10 + a % 10;
                a = a / 10;
            }
            if (value1 + value2 == num){
                return true;
            }
        }
        return false;
    }
}
