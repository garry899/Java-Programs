package com.company;
// Encapsulation -> Binding data with method
class Student{
   private int rollno;
   private String name;

   // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno){
        this.rollno = rollno;
        System.out.println("value of rollno changed");
    }

    public int getRollno(){
        System.out.println("user is accessing the value");
        return rollno;
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(2);
        s1.setName("Navin");

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}
