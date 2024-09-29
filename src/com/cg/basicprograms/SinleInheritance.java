package com.cg.basicprograms;

public class SinleInheritance {
	public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                        + "\nBenefits : " + E1.benefits);
    }
}
class Employee {
    // Base or Super Class
        int salary = 60000;
    }

 

    // Inherited or Sub Class
    class Engineer extends Employee {
        int benefits = 10000;
    }

