package chapter2;

import java.util.Scanner;

public class MadLibs1 {

    public static void main(String[] args) {

        /* Create a program that asks a user for a season of the year,
        then a whole number, then an adjective.  Use the input to complete
        the sentence below then output the result:

        "On a [adjective] [season of the year] day, I drink a
        minimum of [whole number] cups of coffee."
         */

        System.out.println("Please Enter a season of the year : ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Please enter a whole number : ");
        int num = scanner.nextInt();

        System.out.println("Please enter an adjective : ");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + num + " cups of coffee.");


    }
}
