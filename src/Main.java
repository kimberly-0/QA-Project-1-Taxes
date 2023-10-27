import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your salary and we can calculate the taxes!");
        double salary = scanner.nextDouble();
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

        System.out.println("Your taxes are " + taxes);
    }
}