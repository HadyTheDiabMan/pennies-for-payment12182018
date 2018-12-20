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
			System.out.println("Invalid number of days. Please select an integer less than that: ");
			days=user.nextInt();
		}
		System.out.printf("%-20s %20s",day,salary);
		int dayscomp=1;
		double salaryydouble= (double) salaryy;
		
		for(int i=0;i!=days;i++)
		{
			salaryydouble+=salaryydouble;
			System.out.printf("\n%-15d Pennies:%15f",dayscomp,salaryydouble);
			dayscomp=dayscomp+1;
		}
		salaryydouble=salaryydouble/100;
		String total= "Total";
		System.out.printf("\n%-15s $%15f",total,salaryydouble);
		
	}

}
