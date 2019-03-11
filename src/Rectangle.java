class Rectangle{
	public double rectangleLength;
	public double rectangleWidth;
	
	Rectangle(double length,double width){
	rectangleLength=length;
	rectangleWidth=width;
	}	

	public double getArea(){
		return (rectangleLength*rectangleWidth);
	}
	public double getDiagonal(){
		double diagonalResult;
		diagonalResult=(float)Math.sqrt((rectangleLength*rectangleLength)+(rectangleWidth*rectangleWidth));
		return diagonalResult;
	}
	public double getPerimeter(){
		return (2*(rectangleLength*rectangleWidth));
	}
}

