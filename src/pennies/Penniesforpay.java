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
		double days= user.nextDouble();
		double salaryy=1;
		String day="Days";
		String salary="Salary(Pennies)";
		
		System.out.printf("%-15s %15s",day,salary);
		int dayscomp=1;
		double totalpayday=0;
		for(int i=0;i!=days;i++)
		{
			salaryy+=salaryy;
			totalpayday=++salaryy;
			
			System.out.printf("\n%1d %25f",dayscomp,salaryy);
			dayscomp=dayscomp+1;
			
		}
		totalpayday=totalpayday/100;
		String total= "Total";
		System.out.printf("\n%35s","Dollars");
		System.out.printf("\n%-15s $%15.2f",total,totalpayday);
		
	}

}
