package chapter3c;
/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for a least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployeed = 2;

        //Get values for the unknown
        System.out.println("Please enter yearly salary : ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Please enter years employeed at current job : ");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployeed){
                System.out.println("Congrats! You qualify for the loan! ");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job for at least " +
                        requiredYearsEmployeed + " years.");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify");
        }

    }
}


