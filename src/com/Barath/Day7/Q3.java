package com.Barath.Day7;
class Student {
    int rollNumber = 0;
    String name = "";

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = "Unknown";
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Student student1 = new Student(12);
        Student student2 = new Student(11,"Barath");
        System.out.println(student1.rollNumber + ":" + student1.name);
        System.out.println(student2.rollNumber + ":" + student2.name);
    }
}
