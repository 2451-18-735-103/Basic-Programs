package com.cg.basicprograms;

public class HybridInheritance {
	public static void main(String[] args) {
        // Creating an object of the ChildClass
        ChildClass child = new ChildClass();



        // Calling methods from Parent1 and ChildClass
        child.method1();



        // Calling methods from Parent2 and ChildClass
        child.method2();



        // Calling child-specific method
        child.childSpecificMethod();
}
}
interface One {
void method1();
}



//Interface for the second parent class
interface Two{
void method2();
}



//Parent class implementing Parent1
class ParentClass1 implements One {
@Override
public void method1() {
    System.out.println("Implementation of method1() from ParentClass1");
}
}
class ParentClass2 implements Two {
@Override
public void method2() {
    System.out.println("Implementation of method2() from ParentClass2");
}
}



class ChildClass extends ParentClass1 implements Two {
@Override
public void method2() {
    System.out.println("Implementation of method2() from ChildClass");
}
public void childSpecificMethod() {
    System.out.println("Child-specific method");
}
}
