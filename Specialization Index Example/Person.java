import java.time.LocalDate;
import java.time.Period;
import java.io.*;

class Person {
    LocalDate dob;
    String name;
    String gender;

    public void introduction() {
        System.out.println("I am " + this.name);
    }

    public void age() {
        LocalDate today = LocalDate.now();
        System.out.println(Period.between(this.dob, today).getYears());
    }
}