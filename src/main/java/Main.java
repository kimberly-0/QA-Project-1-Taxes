import java.util.Scanner;
public class Main {

    public static double calculateTax(double salary) {

        if (salary < 0) {
            // System.err.println("Salary cannot be negative");
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        double taxes = 0;
        double salaryCalc = salary;
        double temp;

        if(salaryCalc >= 45000) {
            //Calculate the taxes for money above 45,000
            temp = salaryCalc - 44999;
            taxes += 0.25 * temp;

            salaryCalc -= temp;
        }

        if(salaryCalc < 45000 && salaryCalc >= 30000) {
            //Calculate the taxes for money between 30,000 and 44,999
            temp = salaryCalc - 29999;
            taxes += 0.20 * temp;

            salaryCalc -= temp;
        }

        if(salaryCalc < 30000 && salaryCalc >= 20000) {
            //Calculate the taxes for money between 20,000 and 29,999
            temp = salaryCalc - 19999;
            taxes += 0.15 * temp;

            salaryCalc -= temp;
        }

        if(salaryCalc < 20000 && salaryCalc >= 15000) {
            //Calculate the taxes for money between 15,000 and 19,999
            temp = salaryCalc - 14999;
            taxes += 0.10 * temp;

            salaryCalc -= temp;
        }

        //No need for code for taxes between 0 and 14,999 since it is 0.

        return taxes;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salary = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Please input your salary and we can calculate the taxes!");
            try {
                salary = scanner.nextDouble();
                valid = true;
            } catch (Exception e){
                System.out.println("Invalid input, please try again");
                scanner.nextLine();
            }
        }

        System.out.println("Your taxes are " + calculateTax(salary));

    }
}