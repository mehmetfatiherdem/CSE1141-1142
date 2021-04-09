import java.util.Scanner;

public class Pro1 {

    /*
    Name: Mehmet Fatih
    Surname: Erdem


    This is a program that calculates the invoice of each flat in the apartment building.
    There are N flats in a building and apartment heating is the central system.
    30% of bill will be shared equally among the flats,
    the rest (70%) will be shared according to the consumption of each flat.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFlats = scanner.nextInt(); // getting number of flats
        double[] flats = new double[numberOfFlats]; // the array that will store consumption for each flat

        // getting consumptions and adding them to our array
        for(int i = 0;i<numberOfFlats;i++){
            flats[i] = scanner.nextDouble();
        }

       double totalBill = scanner.nextDouble(); // getting the total bill from the user

        double[] bills = calculateTheInvoice(flats, totalBill);
        printBills(bills);
    }

    public static double [] calculateTheInvoice(double[] flats, double totalBill){
        double equalBill = totalBill*30/100; // the bill that each flat will pay equally

        double restOfTheBill = totalBill-equalBill; // rest of the bill after subtracting the equal bill from the total bill

        // this will add all the consumption values to use it to find the total bill for each flat
        double sum = 0;
        for(int i = 0; i<flats.length; i++){
           sum += flats[i];
        }

        double[] totalBillOfEachFlat = new double[flats.length]; // this array stores the total bill for each flat

        // calculating the total bill values for each flat and adding them to our array
        for(int i = 0; i<flats.length; i++){
            totalBillOfEachFlat[i] = (int)(((equalBill / flats.length) + (restOfTheBill * flats[i] / sum)) * 100) / 100.0;
        }

        return totalBillOfEachFlat;
    }

    public static void printBills(double[] bills){

        // printing the total bill for each person
        for(int i  = 1; i<=bills.length; i++){
            System.out.println("Flat #" + i + ": " + bills[i-1]);
        }
    }
}