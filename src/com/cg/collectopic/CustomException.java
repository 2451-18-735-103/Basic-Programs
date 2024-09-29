package com.cg.collectopic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Studentp{
	private int rollNo;
	private String name;
	private int age;
	public Studentp(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Studentp [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomException {
       public static void main(String args[]) throws InvalidAgeException {
    	   List<Studentp> list=new ArrayList<>();
    	   Scanner sc=new Scanner(System.in);
    	   int no=sc.nextInt();
    	   for(int i=0;i<no;i++) {
    		   System.out.println("Enter student roll No");
    		   int rollNo=sc.nextInt();
    		   System.out.println("Enter name");
    		   String name=sc.next();
    		   System.out.println("Enter age");
    		   int age=sc.nextInt();
    		   if(age<0) {
    			   throw new InvalidAgeException("you have entered wrong age");
    		   }
    		   Studentp s=new Studentp(rollNo,name,age);
    		   list.add(s);
    	   }
    	   for(Studentp s:list) {
    		   System.out.println(s);
    	   }
       }
}
