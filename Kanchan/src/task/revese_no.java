package task;

public class revese_no {

	public static void main(String[] args) {
		int no=123;
		int temp;
		temp=no;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("revernumber is:"+rev);
	

	}

}
