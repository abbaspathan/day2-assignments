
class Complex{

	double realNumber;
	double imaginaryNumber;

	public void setValues(double real,double imaginary){
	
		realNumber=real;
		imaginaryNumber=imaginary;
	}
	public void displayComplexNumber(){

		System.out.println("Complex Number is :"+realNumber+"+ i"+imaginaryNumber);
	}
	public void summation(Complex object,Complex object2){
		
		this.realNumber=object.realNumber+object2.realNumber;
		this.imaginaryNumber=object.imaginaryNumber+object2.imaginaryNumber;
	}
}