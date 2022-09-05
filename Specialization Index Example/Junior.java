import java.io.*;

class Junior extends Sophomore {
    public void printCgpa() {
        System.out.println("Who's asking?");
    }

    public void age() {
        System.out.println("...");
    }

    public void status() {
        if (this.major == "engineering") {
            System.out.println("I've given up on living");
        } else {
            System.out.println("I guess it's okay");
        }
    }
}