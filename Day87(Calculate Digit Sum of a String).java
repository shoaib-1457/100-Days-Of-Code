class Solution {
    public String digitSum(String s, int k) {
        StringBuilder str = new StringBuilder();
        int ans = 0;
        while(s.length() > k){
            str.setLength(0);
            for(int i = 0; i < s.length(); i += k){
                ans = 0;
                for(int j = i; j < i + k && j < s.length(); j++){
                    ans += s.charAt(j) - '0';
                }
                str.append(ans);
            }
            s = str.toString();
        }
        return s;
    }
}
