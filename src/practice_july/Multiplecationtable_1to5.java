package practice_july;

public class Multiplecationtable_1to5 
{

		int b;
		public int multiplication()
		
		{
		
			for (int j=1;j<=5; j++)
			{
				System.out.println("**********************" );
			
			for (int i=1; i<=10; i++)
			{
			 
			 b = j * i ;
			
			 System.out.println( +j + " * " +i + " = " +b );
			
			}
			}
			
			
			return b;
		}
			
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			
			
			Multiplecationtable_1to5  obj = new Multiplecationtable_1to5 ();
			
		 obj.multiplication();
			
			
			}
		}
		



