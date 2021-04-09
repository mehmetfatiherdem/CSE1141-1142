import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Name: Mehmet Fatih Erdem


            This program draws a coordinate system and some geometric shapes on the screen based on the user's input.
            It can draw a line, a parabola and a circle

         */

        Scanner scanner = new Scanner(System.in); // Scanner object to get inputs from the user
        System.out.println("Which shape would you like to draw?\n 1. Line\n 2. Parabola\n 3. Circle\n 4. Exit");
        int shape = scanner.nextInt();

        //Calculations for line if the user enters 1
        if (shape == 1) {
            System.out.println("Line formula is y = ax + b");
            System.out.println("Please enter coefficients a and b:");
            double aCoefficient = scanner.nextDouble();
            double bCoefficient = scanner.nextDouble();

            // adding y on top of the graph
            System.out.println("          y");

            //Draws the line
            for (int i = 10; i > -11; i--) {
                for (int j = -10; j <= 10; j++) {
                    if ((aCoefficient * j + bCoefficient) == i) {
                        System.out.print("*");
                    } else if (j == 0 && (aCoefficient * j + bCoefficient) != i) {
                        System.out.print("|");
                    } else if (i == 0 && j != 0 && j!=10) {
                        if ((aCoefficient * j + bCoefficient) != i) {
                            System.out.print("-");
                        }

                    } else if(i == 0 && j == 10){
                        System.out.print("-x");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //Calculations for parabola if the user enters 2
        if (shape == 2) {
            System.out.println("Parabola formula is y = ax^2 + bx + c");
            System.out.println("Please enter coefficients a, b and c:");
            double aCoefficient = scanner.nextDouble();
            double bCoefficient = scanner.nextDouble();
            double cCoefficient = scanner.nextDouble();

            // adding y on top of the graph
            System.out.println("          y");

            //Draws the parabola
            for (int i = 10; i > -11; i--) {
                for (int j = -10; j <= 10; j++) {
                    if ((aCoefficient * j * j + bCoefficient * j + cCoefficient) == i) {
                        System.out.print("*");
                    } else if (j == 0 && (aCoefficient * j * j + bCoefficient * j + cCoefficient) != i) {
                        System.out.print("|");
                    } else if (i == 0 && j != 0 && j!=10) {
                        if ((aCoefficient * j * j + bCoefficient * j + cCoefficient) != i) {
                            System.out.print("-");
                        }

                    } else if(i == 0 && j == 10){
                        System.out.print("-x");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //Calculations for circle if the user enters 3
        if (shape == 3) {
            System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2");
            System.out.println("Please enter center's coordinates (a,b) and radius:");
            double aCoefficient = scanner.nextDouble();
            double bCoefficient = scanner.nextDouble();
            double radius = scanner.nextDouble();

            // adding y on top of the graph
            System.out.println("          y");

            //Draws the circle
            for (int i = 10; i > -11; i--) {
                for (int j = -10; j <= 10; j++) {
                    if (((j - aCoefficient) * (j - aCoefficient) + (i - bCoefficient) * (i - bCoefficient)) == (radius * radius)) {
                        System.out.print("*");
                    } else if (j == 0 && ((j - aCoefficient) * (j - aCoefficient) + (i - bCoefficient) * (i - bCoefficient)) != (radius * radius)) {
                        System.out.print("|");
                    } else if (i == 0 && j!=0 && j!=10){
                        if ( (j - aCoefficient) * (j - aCoefficient) + (i - bCoefficient) * (i - bCoefficient) != (radius * radius)) {
                            System.out.print("-");
                        }
                    } else if(i == 0 && j == 10){
                        System.out.print("-x");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
         //Exits if the user enters 4
        if(shape == 4){
            System.exit(-1);
        }

      }
}
