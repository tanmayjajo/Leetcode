class Subsequences2{
	public static void main(String[] args){

		int[] arr = {1, 2, 0, 3, 1, 2, 0, 3, 0};
		PrintSubs(arr);

	}

	public static void PrintSubs(int[] arr){
		helper(arr, "", 0, 0);
	}

	//sum will be passed in parameter so that we can check it at the end then print accordingly

	public static void helper(int[] arr, String sub, int i, int sum ){
		
		if(i == arr.length){
			if(sum == 1){
				System.out.println(sub);
			}
			return;
		}

		helper(arr, sub + arr[i], i+1, sum + arr[i]); // Take
		helper(arr, sub, i+1, sum); // Not Take
	}

}