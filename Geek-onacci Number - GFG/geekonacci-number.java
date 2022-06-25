/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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
	private static int f(int a, int b, int c, int n){
	    if(n==1) return a;
	    if(n==2) return b;
	    if(n==3) return c;
	    
	    return f(a, b, c, n-1)+f(a, b, c, n-2)+f(a, b, c, n-3);
	}
	
}