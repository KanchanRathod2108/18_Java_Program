package saturday_practise;

public class Armstrong {

	

	public static void main(String[] args) {
		int no=370,number,temp,total=0;
	    number=no;
		while(number!=0)
		{
			temp=number % 10;
			total+=temp*temp*temp;
			number/=10;
		}
			if(total==no)
			
				System.out.println(no+ " Amstrong no");
			
			else 
				System.out.println(no+ " not Amstrong");
			}
		}
		
		
		
		

	


