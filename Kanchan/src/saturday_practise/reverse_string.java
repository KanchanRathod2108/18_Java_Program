package saturday_practise;

public class reverse_string {

	public static void main(String[] args) {
		String name="BABA";
		int leng=name.length();
		System.out.println("string length"+leng);
		String rev=" ";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse String"+rev);
		

	}

}
