import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Name: Mehmet Fatih Erdem


            This program calculates personal income tax based on the given tax rates reported by The Turkish Revenue Administration
         */

        Scanner scanner = new Scanner(System.in); // Scanner object to get inputs from the user
        int year = scanner.nextInt(); // Getting the year from the user.
        double income = scanner.nextDouble(); // Getting the income from the user.

        if(income>0){ // checks if the income is greater than zero
        switch(year) { // switch statement with respect to year
            case 2020:
                if (income < 22000) {
                    double base = 0; // base tax amount
                    double taxAmount = (income * 15) / 100 + base; // this amount will be taxed at 15%.
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    //printing results
                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");

                }else if (income < 49000) {
                    double base = 3300; // base tax amount
                    double taxAmount = ((income-22000) * 20) / 100 + base; // income is taxed as the base amount for the first 22000TL and the other part will be taxed at 20%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income < 180000) {
                    double base = 8700;
                    double taxAmount = ((income-49000) * 27) / 100 + base; // income is taxed as the base amount for the first 49000TL and the other part will be taxed at 27%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income < 600000) {
                    double base = 44070;
                    double taxAmount = ((income-180000) * 35) / 100 + base; // income is taxed as the base amount for the first 180000TL and the other part will be taxed at 35%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income >= 600000) {
                    double base = 191070;
                    double taxAmount = ((income-600000) * 40) / 100 + base; // income is taxed as the base amount for the first 600000TL and the other part will be taxed at 40%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }
                break;
            case 2019:
                if (income < 18000) {
                    double base = 0;
                    double taxAmount = (income * 15) / 100 + base; // this amount will be taxed at 15%.
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");

                }else if (income < 40000) {
                    double base = 2700;
                    double taxAmount = ((income-18000) * 20) / 100 + base; // income is taxed as the base amount for the first 18000TL and the other part will be taxed at 20%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income < 148000) {
                    double base = 7100;
                    double taxAmount = ((income-40000) * 27) / 100 + base; // income is taxed as the base amount for the first 40000TL and the other part will be taxed at 27%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income < 500000) {
                    double base = 36260;
                    double taxAmount = ((income-148000) * 35) / 100 + base; // income is taxed as the base amount for the first 148000TL and the other part will be taxed at 35%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income >= 500000) {
                    double base = 163460;
                    double taxAmount = ((income-500000) * 40) / 100 + base; // income is taxed as the base amount for the first 500000TL and the other part will be taxed at 40%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }
                break;
            case 2018:
                if (income < 14800) {
                    double base = 0;
                    double taxAmount = (income * 15) / 100 + base; // this amount will be taxed at 15%.
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");

                }else if (income < 34000) {
                    double base = 2220;
                    double taxAmount = ((income-14800) * 20) / 100 + base; // income is taxed as the base amount for the first 14800TL and the other part will be taxed at 20%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income < 120000) {
                    double base = 6060;
                    double taxAmount = ((income-34000) * 27) / 100 + base; // income is taxed as the base amount for the first 34000TL and the other part will be taxed at 27%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income >= 120000) {
                    double base = 29280;
                    double taxAmount = ((income-120000) * 35) / 100 + base; // income is taxed as the base amount for the first 120000TL and the other part will be taxed at 35%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }
                break;
            case 2017:
                if (income < 13000) {
                    double base = 0;
                    double taxAmount = (income * 15) / 100 + base; // this amount will be taxed at 15%.
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");

                }else if (income < 30000) {
                    double base = 1950;
                    double taxAmount = ((income-13000) * 20) / 100 + base; // income is taxed as the base amount for the first 13000TL and the other part will be taxed at 20%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income < 110000) {
                    double base = 5350;
                    double taxAmount = ((income-30000) * 27) / 100 + base; // income is taxed as the base amount for the first 30000TL and the other part will be taxed at 27%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }else if (income >= 110000) {
                    double base = 26950;
                    double taxAmount = ((income-110000) * 35) / 100 + base; // income is taxed as the base amount for the first 110000TL and the other part will be taxed at 35%
                    double incomeAfterTax = income - taxAmount;
                    double realTaxRate = (taxAmount / income) * 100;

                    System.out.println("Income: " + (int) (income * 100) / 100.0);
                    System.out.println("Tax Amount: " + (int) (taxAmount * 100) / 100.0);
                    System.out.println("Income After Tax: " + (int) (incomeAfterTax * 100) / 100.0);
                    System.out.println("Real Tax Rate: " + (int) (realTaxRate * 100) / 100.0 + "%");
                }
                break;
            default:
                System.out.println("Undefined year value!");
                break;
        }
        }else {
            System.out.println("Income must be > 0!");
        }
    }
}
