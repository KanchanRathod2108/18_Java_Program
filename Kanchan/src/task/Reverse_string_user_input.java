package task;

import java.util.Scanner;

public class Reverse_string_user_input {

	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int leng=name.length();
		System.out.println("Length od string is:"+leng);
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{ 
			rev=rev+name.charAt(i);
		}
		System.out.println("Revsers of string is :"+rev);
		if(name.equals(rev))
		{
			System.out.println("Palindrome "+name);
		}
		else {
			System.out.println("Not palindrome "+name);
		}

	}

}
