package com.company;

import java.io.IOException;

public class Main {
    static void whileLoop(){
        System.out.println("While Loop syntax is as follows:\n");
        System.out.println("\twhile (condition){");
        System.out.println("\t\tstatements;");
        System.out.println("\t}");
        System.out.println();
    }

    static void ifLoop(){
        System.out.println("If condition syntax is as follows:\n");
        System.out.println("\tif(condition){");
        System.out.println("\t\tstatements if condition is true;");
        System.out.println("\telse{");
        System.out.println("\t\tstatements if condition is not true;");
        System.out.println("\t}");
        System.out.println();
    }

    static void doLoop(){
        System.out.println("do..while loop syntax is as follows:\n");
        System.out.println("\tdo{");
        System.out.println("\t\tstatements if condition is met.;");
        System.out.println("\t}while(condition);");
        System.out.println();
    }

    static void switchLoop(){
        System.out.println("Switch statement syntax is as follows:\n");
        System.out.println("\tSwitch(value to be looped){");
        System.out.println("\t\tCase 'A':");
        System.out.println("\t\t\tstatements if 'A' is true;");
        System.out.println("\t\t\tbreak;");
        System.out.println();
        System.out.println("\t\tCase '...other cases tested for...':");
        System.out.println("\t\t\tstatements if case is true;");
        System.out.println("\t\t\tbreak;");
        System.out.println();
        System.out.println("\t\tdefault:");
        System.out.println("\t\t\tstatements if none of the above cases tested is not true;");
        System.out.println("\t\t\tbreak;");
        System.out.println("\t}");
        System.out.println();

    }

    static void forLoop(){
        System.out.println("For loop syntax is as follows:\n");
        System.out.println("\tFor(Loop variable; Loop condition; Loop function on loop variable){");
        System.out.println("\t\tstatements if condition is met;");
        System.out.println("\t}");
        System.out.println();

    }
    public static void main(String[] args) throws IOException {

        for(;;){

            char loopSelected, ignore;
            do {
                System.out.println(
                        "1: While loop.\n" +
                        "2: If.\n" +
                        "3: Do...while loop.\n" +
                        "4: Switch\n" +
                        "5: For.\n" +
                        "q: Quit the program"

                );

                System.out.println();
                System.out.print("Enter the number of the loop get its assistance: ");
                loopSelected = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
            }while (loopSelected<'1' | loopSelected>'5' & loopSelected != 'q');
            if (loopSelected == 'q') break;
            System.out.println();
            switch (loopSelected) {
                case '1':
                    whileLoop();
                    break;

                case '2':
                    ifLoop();
                    break;

                case '3':
                    doLoop();
                    break;

                case '4':
                    switchLoop();
                    break;

                case '5':
                    forLoop();
                    break;
            }
        }
    }
}


