public class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage computation");
                int present=1;
		int empCheck=(int)Math.floor(Math.random()*10)%2;
		System.out.println("Random Value: "+empCheck);
		if(empCheck==present)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
