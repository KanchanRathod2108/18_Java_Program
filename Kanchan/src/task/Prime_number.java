package task;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int no= sc.nextInt();
		int temp=0;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
			temp=temp+1;
		    }
		}
		if(temp==0)
		{
			System.out.println(no+" prime");
		}
		else {
			System.out.println(no+ "not prime");
		}

				
	}

}
