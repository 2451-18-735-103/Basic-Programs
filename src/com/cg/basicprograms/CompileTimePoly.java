package com.cg.basicprograms;

public class CompileTimePoly {
	public static void main(String[] args)
    {

 

        
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(2, 7, 3));
    }
}
class Helper {


    // Java program for Method Overloading=compile time polymorphism
    static int Multiply(int a, int b)
        {
            return a * b;
        }
     static int Multiply(int a, int b, int c)
        {
        return a * b * c;
        }
    }

