package com.cg.basicprograms;

public class EncapsulationExample {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s = new Student(1,"Manasa",22);
System.out.println("name:" +s.getName());
System.out.println("age:" +s.getAge());
System.out.println("id:" +s.getId());

    }

 

}
class Student {

 

    private int id;
    private String name;
    private int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student() {
        super();
    }
}
