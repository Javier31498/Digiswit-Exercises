import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int option = 0;


        do {
            System.out.println("Choose an option:");
            System.out.println("1) Find the second largest number in an array");
            System.out.println("2) Print the Fibonacci series of a given integer number");
            System.out.println("3) Explain polymorphism, overloading and overriding with the help of a program");
            System.out.println("4) Exit program");
            option = reader.nextInt();

            switch (option){
                case 1: // Exercise 1 - Find the second-largest number in an array

                    break;
                case 2: // Exercise 2 - Print the Fibonacci series of a given integer number

                    break;
                case 3: // Exercise 3 - Explain polymorphism, overloading and overriding with the help of a program

                    break;
                case 4: //Exit program
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("ERROR: not a valid option.");
            }
        }
        while (option != 4);

    }
}