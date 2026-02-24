/**
 *  Java program to demonstrate static keyword.
 */

package com.mykeywords;

/**
 *  Main class.
 */
public class Main {

    // Field of Main class.
    static int number;

    // Default constructor.
    public Main() {

    }
    // Constructor of the class Main.
    public Main(int number) {

        Main.number = number;

    }


    // Entry point for JVM.
    public static void main(String[] args) {

        // Creating instances of Main class.
        Main m1 = new Main(10);
        Main m2 = new Main();

        // Getting value of the number from m1.
        System.out.println(m1.number); // Output: 10

        // Getting value of the number from m2.
        System.out.println(m2.number); // Output: 10. Because static is initialized once pro compilation.

    }
}