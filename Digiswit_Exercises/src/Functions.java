import javax.xml.datatype.DatatypeConfigurationException;

import java.io.IOException;

import java.text.ParseException;
import java.util.Scanner;

public class Functions {

    public static void exercise_1() throws ParseException, DatatypeConfigurationException {

        //    Exercise 1 - Find the second-largest number in an array

        //I'll randomize elements of the array.

        for (int i=0; i<20 ; i++){


        }

    }

    public static void exercise_2() throws ParseException {

        //    Exercise 2 - Print the Fibonacci series of a given integer number

        Scanner reader = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter an integer number: ");
        number = reader.nextInt();
        System.out.println("The fibonacci series of " + number + " is: ");

        int a = 0;
        System.out.println(a); //I've printed the 0 because the fibonacci series starts with 0
        int b = 1;
        int fibonacci = 1;
        for (int k = 0; k < number; k++){
            System.out.println(fibonacci);
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
    }

    public static void exercise_3() throws IOException {

       //   Exercise 3 - Explain polymorphism, overloading and overriding with the help of a program


    }

}
