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
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    while(n-->0){
		        arr[n] = sc.nextInt();
		    }
		    for (int element : arr){
		        System.out.print(element + " ");
		    }
		    System.out.println();
		}
		return;
	}
}