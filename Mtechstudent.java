package oopstudent;

public class Mtechstudent extends Student {

    private int marks;
    private String specilaisation;

    public int averagemarks = 75;

    public Mtechstudent() {
    }

    public Mtechstudent(int rollno, String name, int age,String place, int marks, String specilaisation) {
        super(rollno, name, age, place);
        this.marks = marks;
        this.specilaisation = specilaisation;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSpecilaisation() {
        return specilaisation;
    }

    public void setSpecilaisation(String specilaisation) {
        this.specilaisation = specilaisation;
    }

    public int getSuperclassvariable() {
        return super.averagemarks;
    }

}
