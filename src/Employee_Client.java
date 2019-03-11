import java.util.*;
public class Employee_Client{

	public static void main(String args[]){
		
		int employeeId=0;
		String employeeName="Abbas";
		int employeeBasic=0;

		Scanner objectSc=new Scanner(System.in);

		System.out.println("Enter the employee ID:");
		employeeId=objectSc.nextInt();

		objectSc.nextLine();

		System.out.println("Enter the employee Name:");
		employeeName=objectSc.nextLine();

		System.out.println("Enter the employee Monthly Basic:");
		employeeBasic=objectSc.nextInt();

		Employee object=new Employee(employeeId,employeeName,employeeBasic);

		System.out.println("Employee Annual Basic :"+object.getAnnualBasic());
		System.out.println("Employee Monthly Gross Salary :"+object.getMonthlyGrossSalary());
		System.out.println("Employee Annual Gross Salary :"+object.getAnnualGrossSalary());
		System.out.println("Employee Monthly Deduction :"+object.getMonthlyDeductions());
		System.out.println("Employee Monthly Take Home :"+object.getMonthlyTakeHome());
		System.out.println("Employee Annual Take Home :"+object.getAnnualTakeHome());				
	}
}