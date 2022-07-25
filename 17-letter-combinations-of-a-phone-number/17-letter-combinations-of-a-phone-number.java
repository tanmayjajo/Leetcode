class Solution {
    
    public String[] mapping = new String[] {"0","1","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public List<String> ans = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return ans;
        huehue(digits, "");
        return ans;
    }

	public void huehue(String digits, String s){
		if(digits.length() == 0){
			ans.add(s);
			return;
		}
		int digi = digits.charAt(0) - '0';
		for(int i = 0; i < mapping[digi].length(); i++){
			char ch = mapping[digi].charAt(i);
			huehue(digits.substring(1), s+ch);
			s.substring(0,s.length());	
        }
	}
    
    
}