package task;

import java.util.Scanner;

public class fact_new {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		int i, fact=1;;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("fact of nu"+num+"is:"+fact);
}
}