package saturday_practise;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}

}
