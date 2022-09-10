package task;

import java.util.Scanner;

public class Palindrome_User_input {

	public static void main(String[] args) {
		System.out.print("Enter the no:");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		int temp=no;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+ " palindrome");
		}
		else
		{
			System.out.println(no+ " not palindrome");
		}
		

	}

}
