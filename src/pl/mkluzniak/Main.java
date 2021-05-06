package pl.mkluzniak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // nested loop = a loopinside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows; //declaration rows as intigear
        int columns; //declaration columns as intigear
        String symbol = ""; //symbol what we will be used as string
        System.out.println("Enter # of rows: "); //program is asking user how many rows he need to be displayed
        rows = scanner.nextInt(); //number of rows that user gave is stored in this line
        System.out.println("Enter # of columns: "); //program is asking user how many columns he need to be displayed
        columns = scanner.nextInt(); //number of column that user gave is stored in this line
        System.out.println("Enter symbol to use: "); //program is asking user what symbol he need to be used
        symbol = scanner.next(); //symbol is stored in thich line

        for (int i = 1; i <= rows; i++) { //loop that is in charge of rows
            System.out.println(); //its for next line to move to display next character
            for (int j = 1; j <= columns; j++) { //loop that is in charge of columns
                System.out.print(symbol); //print will dispaly symbol, it must be print not println 

            }
        }
    }
}
