package task;

public class Revser_String {

	public static void main(String[] args) {
		String name="KANCHAN";
		int leng=name.length();
		System.out.println("lenght of string is: "+leng);
		String rev= "";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Revser string is:"+rev);
	}

}
