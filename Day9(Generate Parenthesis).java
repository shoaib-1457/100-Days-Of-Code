class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>(); 
        generate(result, "", n, n); 
        return result; 
    }
    
    public void generate(List<String> result, String s, int left, int right){
        if(left == 0 && right == 0){ 
            result.add(s); 
            return; 
        }
        if(left > 0){ 
            generate(result, s + "(", left - 1, right); 
        }
        if(right > left){ 
            generate(result, s + ")", left, right - 1);
        }
    }
}
