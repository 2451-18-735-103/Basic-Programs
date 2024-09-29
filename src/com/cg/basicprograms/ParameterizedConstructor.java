package com.cg.basicprograms;

public class ParameterizedConstructor {
   String language;
   public ParameterizedConstructor(String language) {
	   this.language=language;
   }
   public static void main(String args[]) {
	   ParameterizedConstructor obj=new ParameterizedConstructor("java");
	   System.out.println("Languages are : "+obj.language);
   }
}
