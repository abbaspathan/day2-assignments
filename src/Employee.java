
class Employee{

	public int employeeId;
	public String employeeName;
	public int monthlyBasic;
	
	Employee(int employeeId1,String employeeName1,int monthlyBasic1){
	
		employeeId=employeeId1;
		employeeName=employeeName1;
		monthlyBasic=monthlyBasic1;	

	}
	
	public double getAnnualBasic(){

		return (12*monthlyBasic);
	}
	public double getMonthlyGrossSalary(){

		return (monthlyBasic+(0.50*monthlyBasic)+1250+800);	
	}
	public double getAnnualGrossSalary(){

		return (12*getMonthlyGrossSalary());		
	}
	public double getMonthlyDeductions(){

		double providentFund=0.0;
		double employeeInsurance=0.0;
		double professionalTax=0.0;

		providentFund=0.10*monthlyBasic;
		
		if(providentFund<6500){

		}
		else{
			providentFund=6500;
		}
		employeeInsurance=0.0475*monthlyBasic;

		
		if(getMonthlyGrossSalary()<=10000){

			professionalTax=50;
		}
		else{
			professionalTax=100;
		}
		return (providentFund+employeeInsurance+professionalTax);
	}
	public double getMonthlyTakeHome(){
		
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	public double getAnnualTakeHome(){
		
		return (12*getMonthlyTakeHome());
	}
		
}