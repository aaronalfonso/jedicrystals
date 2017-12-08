package com.company;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    private static int achieveBalance(int i) throws IOException{

        int r = 0;
        int g = 0;
        int b = 0;

        Scanner file = new Scanner(new File("01.in"));






		/* Insert your code in here.
		 *
		 * Your code should use sc.nextLine() to read the input line by line; each line
		 * contains a 'R', 'G', or 'B' to indicate which crystal has been found.
		 * Your code should return when the next balance is achieved, i.e., return when
		 * you have seen an equal number of red, green, and blue crystals.
		 *
		 * Note that your code will not read all the input from the beginning in a single call,
		 * but rather will continue where the previous call to the function stopped.
		 *
		 */

		/* End */

        while(!(r==i) || !(b==i) || !(g==i)) {

            String crystalColor = file.nextLine();
            if (crystalColor.equalsIgnoreCase("r")) {
                r++;

            } else if (crystalColor.equalsIgnoreCase("g")) {
                g++;

            } else if (crystalColor.equalsIgnoreCase("b")) {
                b++;

            }
        }

        return r;

    }


    public static void main(String[] args) throws IOException {
        System.out.println("Detecting number of test cases...");
        //Scanner sc = new Scanner(System.in);
        Scanner file = new Scanner(new File("01.in"));




        int numOfTestCases = file.nextInt();


        for (int testCase=1; testCase < numOfTestCases; testCase++) {
            int answer = achieveBalance(testCase);
            System.out.println("Balance achieved at " + answer);
        }

        file.close();

    }
}
