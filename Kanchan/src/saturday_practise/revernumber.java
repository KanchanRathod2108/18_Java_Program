package saturday_practise;

public class revernumber {

	public static void main(String[] args) {
		String name="KANCHAN RATHOD";
		int i;
		 String rev = " ";
			int leng=name.length();
			
			System.out.println("The of string is:" +leng);
			for(int i1=leng-1;i1>=0;i1--)
					
			{
			rev=rev+name.charAt(i1);
			}
			System.out.println("The reverse of string:" +rev);
			}

	}


