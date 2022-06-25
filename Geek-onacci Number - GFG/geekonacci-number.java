/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static int[] arr = new int[10];
    
	private static int f(int a, int b, int c, int n){
	    arr[0] = a;
	    arr[1] = b;
	    arr[2] = c;
	    for(int i = 3; i < n; i++){
	        arr[i] = arr[i - 1] + arr[i -2] + arr[i -3];
	    }
	    return arr[n-1];
	}

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int N = sc.nextInt();
		    
		    int ans = f(A, B, C, N);
		    System.out.println(ans);
		}
		
	}
	
		
}