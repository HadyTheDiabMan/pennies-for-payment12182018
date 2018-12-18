/**
 * @author Hady Diab; Pennies for Pay.
 */
package pennies;

import java.util.Scanner;

public class Penniesforpay {

	public static void main(String[] args) 
	{
		Scanner user=new Scanner(System.in);
		System.out.println("Enter in the number of days you would like to earn pennies: ");
		int days= user.nextInt();
		long salaryy=1;
		String day="Days";
		String salary="Salary(Pennies)";
		while(days>64)
		{
			System.out.println("Invalid number of days.ase select an integer less than that: ");
			days=user.nextInt();
		}
		System.out.printf("%-20s %20s",day,salary);
		int dayscomp=1;
		double salaryydouble= Double.parseDouble(salaryy);
		
		for(int i=0;i!=days;i++)
		{
			
			System.out.printf("\n%-20d %20d",dayscomp,salaryy);
			salaryy=salaryy+salaryy;
			dayscomp=dayscomp+1;
		}
	}

}
