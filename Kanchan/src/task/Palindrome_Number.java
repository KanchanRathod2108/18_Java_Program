package task;

public class Palindrome_Number {

	public static void main(String[] args) {
		int no=1234;
		int temp;
		temp=no;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+ "Palidrome");
		}
		else {
			System.out.println(no+ "Not Palindrome");
		}
	}

}
