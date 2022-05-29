/*1.4 Type Conversion Function Library

Create a class with static functions to convert an argument of type boolean to an integer value (0 or 1) and vice versa (zero is false, non-zero value is true). Demonstrate the invocation of functions by calling them from another class created in another package. Apply normal and static import.*/

import lab4_1_4.lab4_1_4_conversion;

import java.util.Scanner;

public class lab1_4 {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean _def = false;

    public static void main(String[] args) {

        boolean _bInput;
        int _iInput;

        lab4_1_4_conversion lab4 = new lab4_1_4_conversion();

        System.out.println("Convert int to boolean [1] | Convert boolean to int[2]");
        String choice;

        choice = scanner.nextLine();
        switch (choice) {
            case "1":
                _bInput = lab4_1_4_conversion.intToBoolean(scanner);
                System.out.println("Conversion Result : " + _bInput);
                break;
            case "2":
                _iInput = lab4.booleanToInt(scanner);
                System.out.println("Conversion Result : " + _iInput);
                break;
        }


    }

}