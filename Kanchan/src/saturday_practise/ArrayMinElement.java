package saturday_practise;

import java.util.Scanner;

public class ArrayMinElement {

	public static void main(String[] args) {
		System.out.println("Enter the length of arry:: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Enter the " +n+ "number of array Element");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			int min=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
			}
			System.out.print("minimun Element is::"+min);
		}

	}


