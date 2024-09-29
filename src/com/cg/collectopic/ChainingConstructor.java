package com.cg.collectopic;

public class ChainingConstructor {
      public ChainingConstructor() {
    	  this(4,4);
    	  System.out.println("Default constructor");
      }

	public ChainingConstructor(int i, int j) {
		// TODO Auto-generated constructor stub
		this(1);
		System.out.println("2 argument constructor");
	}

	public ChainingConstructor(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("one argument constructor");
	}

public static void main(String args[]) {
	ChainingConstructor ob1=new ChainingConstructor();
}
}
