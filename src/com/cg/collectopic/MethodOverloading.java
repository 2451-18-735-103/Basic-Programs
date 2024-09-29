package com.cg.collectopic;
class NegativeInputException extends Exception{
	public NegativeInputException(String message) {
		super(message);
	}
}
class Shape2{
	public double calculateArea(float x,String shapeType) throws NegativeInputException {
		if(x<0) {
			throw new NegativeInputException("Enter proper data");
		}
		if(!shapeType.equalsIgnoreCase("square")) {
			throw new NegativeInputException("Enter proper data");
		}
			
	   return x*x;
		
		}
	public double calculateArea(float x,float y,String shapeType) throws NegativeInputException {
		if(x<0||y<0) {
			throw new NegativeInputException("Enter proper data");
		}
		if(!shapeType.equalsIgnoreCase("rectangle")) {
			throw new NegativeInputException("Enter proper data");
		}
			
	   return x*y;
		
		}
	public double calculateArea(double x,String shapeType) throws NegativeInputException {
		if(x<0) {
			throw new NegativeInputException("Enter proper data");
		}
		if(!shapeType.equalsIgnoreCase("circle")) {
			throw new NegativeInputException("Enter proper data");
		}
			
	   return 3.14*x*x;
		
		}
	
}
public class MethodOverloading {
   public static void main(String args[]) {
	   Shape2 s=new Shape2();
	   try {
		double area=s.calculateArea(6.5,"circle");
		System.out.println("area of circle "+area);
	} catch (NegativeInputException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
