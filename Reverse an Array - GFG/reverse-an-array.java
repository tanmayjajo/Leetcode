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
		        arr[arr.length - n - 1] = sc.nextInt();
		    }
		    rev(arr, 0, arr.length - 1);
		    for (int element : arr){
		        System.out.print(element + " ");
		    }
		    System.out.println();
		}
		return;
	}
	
	private static void rev(int[] arr, int start, int end){
	    if(start >= end){
	        return;
	    }
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	    
	    rev(arr, start + 1, end - 1);
	}
	
	
}