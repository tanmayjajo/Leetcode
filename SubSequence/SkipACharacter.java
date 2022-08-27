public class SkipACharacter {
	public static void main(String[] args){
		String s = "";
		String ans = help(s);
		System.out.println(ans);
	}



	public static String help(String s){
		if(s.length() == 0) return "";
		if(s.length() == 1){
			if(s.charAt(0) == 'a') return "";
			else return s;
		}
		if(s.charAt(0) == 'a'){
			return help(s.substring(1));
		}

		return s.charAt(0) + help(s.substring(1));
	}

}

