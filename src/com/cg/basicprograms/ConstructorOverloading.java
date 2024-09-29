package com.cg.basicprograms;

public class ConstructorOverloading {
	String language;
	int rating;
   public ConstructorOverloading() {
	   language="java";
   }
   public ConstructorOverloading(String language) {
	   this.language=language;
   }
   public ConstructorOverloading(int rating) {
	   this.rating=rating;
   }
   public static void main(String args[]) {
	   ConstructorOverloading obj1=new ConstructorOverloading();
	   ConstructorOverloading obj2=new ConstructorOverloading("python");
	   ConstructorOverloading obj3=new ConstructorOverloading(5);
	   System.out.println("language is : "+obj1.language);
	   System.out.println("language is : "+obj2.language);
	   System.out.println("rating is: "+obj3.rating);
   }
}
