package com.cg.basicprograms;

public class MultilevelInheritance {
	public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.sleep(); 
        dog.giveBirth(); 
        dog.bark(); 
    }
}

class Animal {
  public void eat() {
        System.out.println("Animal is eating.");
    }



    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}
class Mammal extends Animal {
public void giveBirth() {
  System.out.println("Mammal is giving birth.");
}
}
class Dog extends Mammal {
public void bark() {
  System.out.println("Dog is barking.");
}
}

