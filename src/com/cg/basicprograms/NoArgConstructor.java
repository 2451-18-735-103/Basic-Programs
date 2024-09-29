package com.cg.basicprograms;

public class NoArgConstructor {
   String language;
   public NoArgConstructor() {
	   language="java";
   }
   public static void main(String args[]) {
	   NoArgConstructor obj=new NoArgConstructor();
	   System.out.println("language is : "+obj.language);
   }
}
