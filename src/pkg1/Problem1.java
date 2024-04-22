package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[]= {10,34,43,11};
		
		System.out.println("array print: "+ Arrays.toString(a));
		
	
		Arrays.sort(a);
		
		System.out.println("after sorting: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("after sorting: " + a[i]);
		}
		
		sc.close();
		
		 System.out.println("1st smallest element: " + a[0]);
	    System.out.println("1st largest element: " + a[a.length - 1]);
		
		
	}
}
