class Subsequences{
	public static void main(String[] args){
		String name = "abc";
		PrintSubs(name);
	}

	public static void PrintSubs(String s){
		helper(s, "-", 0);
	}

	public static void helper(String s, String sub, int i){
		if(i == s.length()){
			System.out.println(sub);
			return;
		}
		helper(s, sub + s.charAt(i), i+1);
		helper(s, sub, i+1);
	}
}