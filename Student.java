package oopstudent;

public class Student {
    private int rollno;
    private String name;
    private int age;
    private String place;

    public int averagemarks = 100;

    public Student() {
    }

    public Student(int rollno, String name, int age , String place) {

        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void set(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getplace() {
        return place;
    }

    public void setplace(String place) {
        this.place = place;
    }

    //never add code in getter and setters

    // even add methos is not goo fprqactice bcos all logic should be in another class where business req is satisifed
}
