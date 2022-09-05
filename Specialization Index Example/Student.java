import java.io.*;

class Student extends Person {
    String profession;
    float cgpa;
    int creditCompleted;
    int courseRepeats;
    String program;
    String school;
    String major;
    String minor;

    public void introduction() {
        System.out.println("Hi, I am" + this.name + ". I am a university student");
    }

    public void printCgpa() {
        System.out.println(this.cgpa);
    }
}