import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws DatatypeConfigurationException, ParseException, IOException {

        Scanner reader = new Scanner(System.in);
        int menu = 0;
        Functions func = new Functions();

        do {
            System.out.println("Choose an option:");
            System.out.println("1) Find the second largest number in an array");
            System.out.println("2) Print the Fibonacci series of a given integer number");
            System.out.println("3) Explain polymorphism, overloading and overriding with the help of a program");
            System.out.println("4) Exit program");
            menu = reader.nextInt();

            switch (menu){
                case 1: // Exercise 1 - Find the second-largest number in an array
                    func.exercise_1();
                    break;
                case 2: // Exercise 2 - Print the Fibonacci series of a given integer number
                    func.exercise_2();
                    break;
                case 3: // Exercise 3 - Explain polymorphism, overloading and overriding with the help of a program
                    func.exercise_3();
                    break;
                case 4: //Exit program
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("ERROR: not a valid option.");
            }
        }
        while (menu != 4);

    }
}