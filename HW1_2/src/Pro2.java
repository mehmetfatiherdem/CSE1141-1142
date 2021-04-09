import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        /*
           Name: Mehmet Fatih Erdem


           This is a program to calculate the compound monthly interest. The program asks user to
           enter value of principle (p), annual interest rate (r) and time (t) and
           finally calculates the compound interest by following formula.

                 𝐴=𝑃∗(1+𝑟12)^t

            A: Final amount
            P: Initial principle balance
            r: interest rate
            t: number of time periods (in terms of months)

         */

        Scanner scanner = new Scanner(System.in); // Scanner object to get input from user.

        System.out.println("Enter initial principle balance:"); // Asking for initial principle balance from the user.
        double initialPrincipleBalance = scanner.nextDouble(); // Getting the initial principle balance from the user.
        System.out.println("Enter yearly interest rate (Ex: 9.45):"); // Asking for yearly interest rate from the user.
        double yearlyInterestRate = scanner.nextDouble(); // Getting the yearly interest rate from the user.
        System.out.println("Enter monthly time periods (Ex: 8):"); // Asking for monthly time periods from the user.
        int monthlyTimePeriods = scanner.nextInt(); // Getting the  monthly time periods from the user.

        double monthlyInterestRate = yearlyInterestRate / 12; // Dividing yearly interest rate by 12 to find monthly interest rate.

        yearlyInterestRate /= 100; // Dividing yearly interest rate by 100 to convert the percentages to decimal.

        // Calculating the compound monthly interest
        double compoundMonthlyInterestRate = initialPrincipleBalance * Math.pow(1+(yearlyInterestRate/12), monthlyTimePeriods);

        double totalCompoundInterest = compoundMonthlyInterestRate - initialPrincipleBalance; // Finds the total compound interest.

        double finalBalance = initialPrincipleBalance + totalCompoundInterest; // Gives us the final balance

        /* Calculations to print output values with up to 2 digits after the decimal point.

            1- Multiplying the double value by 100.
            2- Casting the value from step 1 to int and assigning it to a temp value.
            3- Casting the temp value to double, dividing it by 100 and assigning it to the double value we want to print.

         */
        initialPrincipleBalance *= 100;
        int temp1 = (int) initialPrincipleBalance;
        initialPrincipleBalance = (double)temp1 / 100;

        monthlyInterestRate *= 100;
        int temp2 = (int) monthlyInterestRate;
        monthlyInterestRate = (double)temp2 / 100;

        totalCompoundInterest *= 100;
        int temp3 = (int) totalCompoundInterest;
        totalCompoundInterest = (double)temp3/100;

        finalBalance *= 100;
        int temp4 = (int) finalBalance;
        finalBalance = (double)temp4/100;

        // printing the results

        System.out.println("Initial balance " + initialPrincipleBalance);
        System.out.println("Monthly interest rate " + monthlyInterestRate);
        System.out.println("Total compound interest: " + totalCompoundInterest);
        System.out.println("Final balance: " + finalBalance);

    }
}
