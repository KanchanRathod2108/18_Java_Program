
package saturday_practise;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {

	    System.out.print("Enter the number of Elements::");
	    
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		
		System.out.print("Enter the "+ n +" number of array elements::");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {//0 1 2 3 4
			a[i]=sc.nextInt();
		}
		System.out.print("The reverse of array Elements are as follow::");
		
		for(int i=a.length-1;i>=0;i--) {//  0
			System.out.print(" "+a[i]);
			}
		}
		
		

	} 


