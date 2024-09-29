package com.cg.basicprograms;

public class RuntimePoly {
	public static void main(String[] args)
    {

 

     Parent a = new Subclass1();
        a.Print();

 

        a = new Subclass2();
        a.Print();
    }

 

}
class Parent {

 

    
    // Java Program for Method Overriding=runtime polymorphism
        void Print()
        {

 

        System.out.println("parent class");
        }
    }

 

    
    class Subclass1 extends Parent {

 

    @Override
        void Print()
        {
            System.out.println("subclass1"); }
    }

 

    class Subclass2 extends Parent {

 

        @Override
        void Print()
        {
            System.out.println("subclass2");
        }
    }

