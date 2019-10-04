package chapter3;

/*
If Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values  for the unknow
        System.out.println("How many sales did the salesperson make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detours for bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The salesperson's salary is $" + salary);
    }
}
