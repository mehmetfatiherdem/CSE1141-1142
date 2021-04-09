import java.util.Scanner;

public class Pro3 {

    /*
    Name: Mehmet Fatih
    Surname: Erdem


    This is a program that takes an input letter and outputs it in a diamond shape.
    Given a letter, it prints a diamond starting with 'A',
    with the supplied letter at the widest point.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Letter:");
        String tempLetter = scanner.nextLine(); // templetter for input check

        // input check
        if(tempLetter.length() != 1){
            System.out.println("Invalid Input !");
            System.exit(-1);
        }

        // making the tempLetter uppercase and assigning it to letter char variable
        char letter = tempLetter.toUpperCase().charAt(0);
        char[][] diamond = constructDiamond(letter);
        printDiamond(diamond);

    }
    public static char[][] constructDiamond (char letter){
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'}; // this will store the alphabet

        // input check
        if(!Character.isLetter(letter)){
            System.out.println("Invalid Input !");
           System.exit(-1);
        }

        int index = new String(letters).indexOf(letter); // index value to be used later
        int rowAndColumn = ( (index+1) * 2 - 1); // row and column length
        char[][] diamondArray = new char[rowAndColumn][rowAndColumn]; // this will store our diamond shape

        //building the diamond
        for(int i = 0; i<diamondArray.length; i++){
            for(int j = 0; j<diamondArray.length; j++){
                if(index>=i && ((j == index-i) || (j == index+i))){
                    diamondArray[i][j] = letters[i];
                }else if(i>index && ((j == i-index) || (index*3 == i+j))){
                    diamondArray[i][j] = letters[diamondArray.length-i-1];
                }else{
                    diamondArray[i][j] = '.';
                }
            }
        }

        return diamondArray;
    }
    public static void printDiamond (char[][] diamond){

        // printing the result
        for(int i = 0; i<diamond.length; i++){
            for(int j = 0; j<diamond[i].length; j++){
                System.out.print(diamond[i][j]);
            }
            System.out.println();
        }
    }
}