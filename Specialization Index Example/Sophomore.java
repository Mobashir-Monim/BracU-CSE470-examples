import java.io.*;

class Sophomore extends Freshman {
    public void introduction() {
        System.out.println(this.name);
    }

    public void printCgpa() {
        if (this.cgpa < 3) {
            System.out.println("Not too good");
        } else if (this.cgpa < 3.5) {
            System.out.println("It's okay");
        } else if (this.cgpa < 4) {
            System.out.println("Not too good");
        } else {
            System.out.println("It could have been better");
        }
    }
}