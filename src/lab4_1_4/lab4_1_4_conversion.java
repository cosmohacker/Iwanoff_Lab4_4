package lab4_1_4;

import java.util.Scanner;

public class lab4_1_4_conversion {

    public static int booleanToInt( Scanner scanner) {
        boolean _def;
        System.out.println("Please type true or false : ");
        _def = scanner.hasNext();
        System.out.println("Converting boolean to integer  ");
        int converted = _def ? 1 : 0;
        System.out.println("Result of Conversion : " + converted);

        return converted;
    }

    public static boolean intToBoolean( Scanner scanner) {
        boolean tf = false;
        int _def;
        System.out.println("Please type 0 or different number : ");
        _def = scanner.nextInt();
        System.out.println("Converting integer to boolean  ");
        if (_def == 0) {
            tf = false;
        } else if (_def > 0) {
            tf = true;
        }

        return tf;
    }

}
