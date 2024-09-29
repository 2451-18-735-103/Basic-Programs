package com.cg.collectopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Product {
    private int prodId;
    private  String name;
    private  int cost;
    
    public Product(int prodId,String name,int cost) {
    	this.prodId=prodId;
    	this.name=name;
    	this.cost=cost;
    }
    

	public int getProdId() {
		return prodId;
	}


	public void setProdId(int prodId) {
		this.prodId = prodId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
class ProductIdComparator implements Comparator<Product>{
    
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		///Product p1=o1;
		Product p2=o2;
		if(o1.getProdId()>o2.getProdId()) {
			return 1;//return -1 for reverse order
		}
		else if(o1.getProdId()<o2.getProdId()) {
			return -1;//return 1 for reverse order
		}
		return 0;
	}
	
}
class ProductNameComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		return o1.getName().compareTo(o2.getName());//o2.getName().compareTo(o2.getName())
	}
	
}
public class ComparatorEg {
	public static void main(String args[]) {
		List<Product> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of products");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println("Enter the product id");
			int prodId=sc.nextInt();
			System.out.println("Enter the product name");
			String name=sc.next();
			System.out.println("Enter the product cost");
			int cost=sc.nextInt();
			Product p1=new Product(prodId,name,cost);
			list.add(p1);
		}
		System.out.println("Sorting based on product Id");
		Collections.sort(list,new ProductIdComparator());
		for(Product p:list) {
			System.out.println(p);
		}
		System.out.println("sorting based on product name");
		Collections.sort(list,new ProductNameComparator());
		for(Product p:list) {
			System.out.println(p);
		}
	}

}
