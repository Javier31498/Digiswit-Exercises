import javax.xml.datatype.DatatypeConfigurationException;

import java.io.IOException;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Functions {

    public static void exercise_1() throws ParseException, DatatypeConfigurationException {

        //    Exercise 1 - Find the second-largest number in an array

        Scanner reader = new Scanner(System.in);
        int size = 0;
        System.out.println("Enter an integer number: ");
        size = reader.nextInt();

        //We'll randomize elements of the array.
        Random random = new Random();
        int[] arrayExercise = random.ints(size, 1,100).toArray();

        //Printing the array for the user
        System.out.println("Array created: " + Arrays.toString(arrayExercise));

        //Once we have the array created, we'll proceed to arrange the array using a sorting algorithm, like Quicksort
        Quicksort qs = new Quicksort();
        qs.quicksort(arrayExercise, 0, arrayExercise.length - 1);
        System.out.println("Array sorted: " + Arrays.toString(arrayExercise));

        //We print the second-highest number of the array
        System.out.println(arrayExercise[1]);

    }

    public static void exercise_2() throws ParseException {

        //    Exercise 2 - Print the Fibonacci series of a given integer number

        Scanner reader = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter an integer number: ");
        number = reader.nextInt();
        System.out.println("The fibonacci series of " + number + " is: ");

        int a = 0;
        System.out.println(a); //We've printed the 0 because the fibonacci series starts with 0
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
        System.out.println("Polymorphism allows us to utilize methods with the same name. It is the ability to do the same action in different ways. It is one of the pillars of OOP.");
        System.out.println("For explaining overloading and overriding, the user should introduce three numbers.");

        System.out.println("Introduce the first number: ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();
        System.out.println("Introduce the second number: ");
        Scanner number2 = new Scanner(System.in);
        int n2 = number2.nextInt();
        System.out.println("Introduce the third number: ");
        Scanner number3 = new Scanner(System.in);
        int n3 = number3.nextInt();

        System.out.println("Overloading is the term given to methods that share the same name, but that differentiate by the different elements that compose them (the name and parameter list). ");
        System.out.println("The numbers below are the result of two different methods that share the same name, with two parameters in common, but the second method is given one less parameter ");
        System.out.println("(3 and 2 parameters are given respectively), thus allowing the programmer to share names for their methods, in this particular case, Operation(), from the class Polymorphism. ");
        Polymorphism poly = new Polymorphism();
        System.out.println("Sum of the three numbers: ");
        poly.Operation(n1, n2, n3);
        System.out.println("Sum of the first two numbers: ");
        poly.Operation(n1, n2);

        System.out.println("Overriding is a characteristic that allows subclasses to do an implementation of a method that has been declared in a parent class. ");
        System.out.println("This allows the child class to give it's own implementation on that method. In this case, we have created the class Multiplication that extends from Polymorphism, ");
        System.out.println("and both classes have the method Operation(). The number below is given by the class Multiplication which is overriding the method Operation() by ");
        System.out.println("giving it his own implementation, in this case, instead of adding two numbers, it is multiplying both numbers.");
        Multiplication mul = new Multiplication();
        System.out.println("Multiplication of the first two numbers: ");
        mul.Operation(n1, n2);

    }

}
