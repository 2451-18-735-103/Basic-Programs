package com.cg.basicprograms;

import java.util.Scanner;

public class Product {
	int pid;

	String pname;

	String des;

	double price;

	 

	public int getPid() {

	return pid;

	}

	 

	public void setPid(int pid) {

	this.pid = pid;

	}

	 

	public static void main(String[] args) throws ProductNotFoundException {

	Product p=new Product();

	System.out.println("Enter productID");

	Scanner sc=new Scanner(System.in);

	int id=sc.nextInt();

	p.setPid(id);

	if(p.getPid()<0) {

	throw new ProductNotFoundException("Product is not valid");

	}

	else {

	System.out.println("Valid product");

	}

	 

	}
}
