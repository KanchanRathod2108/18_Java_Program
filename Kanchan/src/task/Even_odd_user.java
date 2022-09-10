package task;

import java.util.Scanner;

public class Even_odd_user {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n %2==0)
		{
			System.out.print("Even");
		}
		else {
			System.out.print("odd");
		}

	}

}
