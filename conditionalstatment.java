public class conditionalstatment {

	public static void main(String[] args) {
		
		int mark=75;
		if(mark>=95)
		{
			System.out.println("excellent");
		}
		else if(mark>=90)
		{
			System.out.println("very good");
		}
		else if(mark>=80)
		{
		   System.out.println("good");	
		}
		else if(mark>=60)
		{
			System.out.println("Average");
		}
		else if(mark>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
    }
}