package com.cg.collectopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//oka object to sort something based on single element we use comparator
class Student implements Comparable<Student>{
	private int rollNo;
	String name;
	int marks;
	
	Student(int rollNo,String name,int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.rollNo>o.rollNo) {
			return 1;
		}
		else if(this.rollNo<o.rollNo) {
			return -1;
		}
		else
		return 0;
	}
	
	
}

public class ComparableEx {
 public static void main(String args[]) {
	      List<Student> list=new ArrayList<>();
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the no of students");
	      int n=sc.nextInt();
	      sc.nextLine();
	      for(int i=1;i<=n;i++)
	      {
		 System.out.println("Enter roll no");
		 int rollNo=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter name");
		 String name=sc.nextLine();
		 System.out.println("Enter marks");
		 int marks=sc.nextInt();
		 sc.nextLine();
		Student s=new Student(rollNo,name,marks);
		list.add(s);
	      }
//	      for (Student s : list) {
//	            System.out.println("Student Roll No: " + s.getRollNo());
//	            System.out.println("Student Name: " + s.getName());
//	            System.out.println("Student Marks: " + s.getMarks());
//	            System.out.println(); // Separate each student's details
//	        } 
	      //or
	      Collections.sort(list,Collections.reverseOrder());
	      for(Student s:list) {
	    	  System.out.println(s);
	      }
 }
}
