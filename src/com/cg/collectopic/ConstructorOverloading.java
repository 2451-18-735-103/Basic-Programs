package com.cg.collectopic;

import java.util.Scanner;

//code to find area of different shapes and throw custom exception when input is less than zero
class InvalidInputException extends Exception{
	public InvalidInputException(String message) {
		super(message);
	}
}
class Shape1{
	public Shape1() {
		}
	public Shape1(float x,String shapeType) throws InvalidInputException  {
		if(x<0) {
			throw new InvalidInputException("enter proper input");
		}
		if(shapeType.equalsIgnoreCase("square")) {
		System.out.println("Area of square is "+Math.pow(x, 2));
		}
		else {
			throw new InvalidInputException("enter proper input");
		}
	}
	public Shape1(float x,float y,String shapeType) throws InvalidInputException{
		if(x<0||y<0) {
			throw new InvalidInputException("enter proper input");
		}
		if(shapeType.equalsIgnoreCase("rectangle")) {
			System.out.println("Area of rectangle is "+x*y);
		}
		else {
			throw new InvalidInputException("enter proper input");
		}
		
	}
	public Shape1(double x,String shapeType) throws InvalidInputException {
		if(x<0) {
			throw new InvalidInputException("enter proper input");
		}
		if(shapeType.equalsIgnoreCase("Circle")) {
			System.out.println("Area "+(3.14*x*x));
		}
		else {
			System.out.println("enter proper input");
		}
	}
}


public class ConstructorOverloading {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 try {
			Shape1 s=new Shape1(5,6,"circle");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
}
