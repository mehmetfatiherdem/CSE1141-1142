import java.util.Scanner;

public class Pro2 {

    /*
    Name: Mehmet Fatih
    Surname: Erdem


    This is a program that will determine whether or not it is valid per the Luhn formula.
    The Luhn algorithm is a simple checksum formula used to validate a variety of identification numbers,
    such as credit card numbers. The task is to check if a given string is valid.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine(); // getting number as a string from the user

        // invoking the validateNumber and printing the results
        validateNumber(number);
    }
    public static boolean validateNumber (String number){
        // check if the string's length is bigger than 1
        if(number.length()<=1){
            System.out.println("Invalid Input !");
            return false;
        }
        String DNumber = ""; // initiating the DNumber value

        // removing spaces in the string
        String noSpaceString = "";
        for(int i = 0; i<number.length(); i++){
            if(number.charAt(i) != ' '){
                noSpaceString += number.charAt(i);

            }
        }

        int[] nums = new int[noSpaceString.length()]; // this will store the numbers

        // Checking the input and assigning values to the DNumber and adding them to the array
        for (int i = 0; i<noSpaceString.length(); i++) {
            if (!Character.isDigit(noSpaceString.charAt(i))) {
                System.out.println("Invalid Input !");
                return false;
            } else if (noSpaceString.length() % 2 == 0 && i % 2 == 0) {
                DNumber += noSpaceString.charAt(i);
                String temp = noSpaceString.charAt(i) +"";
                int num1 = Integer.parseInt(temp);
                nums[i] = ((num1 * 2 > 9) ? num1 * 2 - 9 : num1 * 2);
            } else if (noSpaceString.length() % 2 == 0 && i % 2 != 0) {
                DNumber += "_";
                String temp = noSpaceString.charAt(i) +"";
                int num2 = Integer.parseInt(temp);
                nums[i] = num2;

            } else if (noSpaceString.length() % 2 != 0 && i % 2 == 0) {
                DNumber += "_";
                String temp = noSpaceString.charAt(i) +"";
                int num3 = Integer.parseInt(temp);
                nums[i] = num3;

            } else if (noSpaceString.length() % 2 != 0 && i % 2 != 0) {
                DNumber += noSpaceString.charAt(i);
                String temp = noSpaceString.charAt(i) +"";
                int num4 = Integer.parseInt(temp);
                nums[i] = ((num4 * 2 > 9) ? num4 * 2 - 9 : num4 * 2);
            }
        }
        // printing LNumber and DNumber
        System.out.println("DNumber:" + DNumber);
        System.out.print("LNumber:");

        // adding the numbers
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]);
            sum += nums[i];
        }
        System.out.println();

        // Checking if the number is valid
        if(sum % 10 != 0 || (sum/10)%2 != 0){
            System.out.println("Number is Invalid");
            return false;
        }
        System.out.println("Number is Valid");
        return true;
    }
}