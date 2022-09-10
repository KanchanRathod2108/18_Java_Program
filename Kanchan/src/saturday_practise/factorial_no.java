package saturday_practise;

import java.util.Scanner;

public class factorial_no {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
	   int i=1;
	
	long fact=1;
	for (i=1;i<=num;i++) 
	{
		fact=fact *i;
		
	}
	System.out.println("Factorial of number:"+fact);
	}	
	

}
