package com.cg.basicprograms;

public class MultipleInheritance {
	public static void main(String[] args) {

        Child child = new Child();

 

       
        child.method1();  
        child.method2();  

 

       
        child.childSpecificMethod(); 
}
}

 

interface Parent1 {
    void method1();
}

 

//by using intefaces only we can acheive 
interface Parent2 {
    void method2();
}

 


    class Child implements Parent1, Parent2 {
        @Override
        public void method1() {
            System.out.println("Implementation of method1() from Parent1");
        }

 

        @Override
        public void method2() {
            System.out.println("Implementation of method2() from Parent2");
        }

 

        // Additional method specific to Child
        public void childSpecificMethod() {
            System.out.println("Child-specific method");
        }
    }

