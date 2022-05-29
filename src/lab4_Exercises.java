/*4 Exercises

All exercises involve creating a console application. Calculations of the main result should be performed in a separate static function, which is called from the main() function. Input and output are performed in the main() function.

  1  Enter two valid numbers. Find and display the arithmetic mean of the squares of numbers.
  2  Enter two valid numbers. Find and display geometric mean - square root of their product. If the root is not possible to calculate, display an error message.
  3  Enter a positive integer. Find and display the product of digits that represent this number.
  4  Enter a positive integer. Find and display the sum of even digits of this number.
  5  Enter a positive integer. Find and display the sum of squares of digits of this number.
  6  Enter a positive integer. Find and display the sum of odd digits of this number.
  7  Enter a positive integer. Find and display the product of even digits of this number.
  8  Enter a positive integer. Find and display the product of odd digits of this number.
  9  Enter a positive integer. Check whether it is prime number. Output under "yes" or "no".
 10  Enter a positive integer. Check whether it is an exact square of another integer. Print the number found, or "no" otherwise.
 11  Enter two integer positive numbers. Find and display the lowest common multiple of these numbers.
 12  Enter a real number and the exponent (positive or negative). Calculate and output power.
 13  Enter a positive integer n. Find and display the product of the first n positive odd integers.
 14  Enter integer positive numbers n and m, m < n. Find and display the product of the first n positive integers, excluding m.
 15  Enter integer positive numbers n and m, m < n. Find and display the sum of the first n positive integers, excluding m.
 16  Enter an integer - the number of degrees angle. Find and display the value of the sine of an angle.
 17  Enter an integer - the number of degrees angle. Find and display the value of the cosine of the angle.
 18  Enter an integer - the number of degree n. Find and display the sum of sines of angles in degrees from unity to n
 19  Create a recursive function for calculating the sum of squares of the first n numbers.
 20  Create a recursive function for calculating the product of the sines of the first n natural numbers.
*/

import utils.Exercises;

import java.util.Scanner;

public class lab4_Exercises implements Exercises {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeAndAsk();
    }

    //Enter two valid numbers. Find and display the arithmetic mean of the squares of numbers.
    @Override
    public void exec1() {
        int x = 8, y = 5;
        double art = ((x * x) + (y * y)) / 2;
        System.out.println("Arithmetic mean of the squares of numbers [" + x + "] | [" + y + "] : " + art);
    }

    //Enter two valid numbers. Find and display geometric mean - square root of their product. If the root is not possible to calculate, display an error message.
    @Override
    public void exec2() {
        double x = 5, y = 5, product = x * y;
        System.out.println("Geometric mean of the numbers [" + x + "] | [" + y + "] : " + Math.pow(product, 0.5));
        if (product < 0) {
            System.out.println("Error! Square root of a negative number is not a real number");
        } else {
            double r = Math.sqrt(product);
            System.out.println("Square root of " + product + " is " + r);
        }
    }

    //Enter a positive integer. Find and display the product of digits that represent this number.
    @Override
    public void exec3() {
        int x, rem, prod = 1;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        while (x != 0) {
            rem = x % 10; // get the last-digit
            prod *= rem; // calculate product of digits
            x /= 10;  // remove the last digit
        }
        System.out.println("Enter a positive integer : " + prod);
    }

    //Enter a positive integer. Find and display the sum of even digits of this number.
    @Override
    public void exec4() {
        int x, lastDigit = 0, evenDigitSum = 0, sumOfEvenDigits = 0, number;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        number = x;
        while (x != 0) {
            lastDigit = x % 10;
            if (lastDigit % 2 == 0)
                evenDigitSum += lastDigit;
            x = x / 10;
        }
        sumOfEvenDigits = evenDigitSum;
        System.out.println("The sum of even digits of this number : " + number + " = " + sumOfEvenDigits);
    }

    //Enter a positive integer. Find and display the sum of squares of digits of this number.
    @Override
    public void exec5() {
        int x, lastDigit = 0, evenDigitSum = 0, sumOfEvenDigits = 0, number;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        number = x;
        while (x != 0) {
            lastDigit = x % 10;
            evenDigitSum += lastDigit * lastDigit;
            x = x / 10;
        }
        sumOfEvenDigits = evenDigitSum;
        System.out.println("The sum of squares of digits of this number : " + number + " = " + sumOfEvenDigits);
    }

    //Enter a positive integer. Find and display the sum of odd digits of this number.
    @Override
    public void exec6() {
        int x, lastDigit = 0, evenDigitSum = 0, sumOfEvenDigits = 0, number;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        number = x;
        while (x != 0) {
            lastDigit = x % 10;
            if (lastDigit % 2 != 0)
                evenDigitSum += lastDigit;
            x = x / 10;
        }
        sumOfEvenDigits = evenDigitSum;
        System.out.println("The sum of odd digits of this number : " + number + " = " + sumOfEvenDigits);
    }

    //Enter a positive integer. Find and display the product of even digits of this number.
    @Override
    public void exec7() {
        int x, lastDigit = 0, evenDigitSum = 1, sumOfEvenDigits = 1, number;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        number = x;
        while (x != 0) {
            lastDigit = x % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum *= lastDigit;
            }
            x = x / 10;
        }
        sumOfEvenDigits = evenDigitSum;
        System.out.println("The product of even digits of this number : " + number + " = " + sumOfEvenDigits);
    }

    //Enter a positive integer. Find and display the product of odd digits of this number.
    @Override
    public void exec8() {
        int x, lastDigit = 0, evenDigitSum = 1, sumOfEvenDigits = 1, number;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        number = x;
        while (x != 0) {
            lastDigit = x % 10;
            if (lastDigit % 2 != 0) {
                evenDigitSum *= lastDigit;
            }
            x = x / 10;
        }
        sumOfEvenDigits = evenDigitSum;
        System.out.println("The product of odd digits of this number : " + number + " = " + sumOfEvenDigits);
    }

    //Enter a positive integer. Check whether it is prime number. Output under "yes" or "no".
    @Override
    public void exec9() {
        int x;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= x / 2; ++i) {
            // condition for nonprime number
            if (x % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    //Enter a positive integer. Check whether it is an exact square of another integer. Print the number found, or "no" otherwise.
    @Override
    public void exec10() {
        double x;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        double y = Math.sqrt(x);

        if (Math.pow(y, 2) == y)
            System.out.println("Yes ");

        //Do stuff

        if (((y - Math.floor(y)) == 0)) {
            System.out.print(x + " is a perfect square number");
        } else {
            System.out.print(x + " is not a perfect square number");
        }

    }

    //Enter two integer positive numbers. Find and display the lowest common multiple of these numbers.
    @Override
    public void exec11() {
        int x, y, comm_point;
        System.out.println("Enter two positive integer : ");
        System.out.println("x : ");
        x = scanner.nextInt();
        System.out.println("y : ");
        y = scanner.nextInt();

        comm_point = (x > y) ? x : y;

        while (true) {
            if (comm_point % x == 0 && comm_point % y == 0) {
                System.out.printf(" the lowest common multiple of %d and %d numbers is : %d", x, y, comm_point);
                break;
            }
            ++comm_point;
        }
    }

    //Enter a real number and the exponent (positive or negative). Calculate and output power.
    @Override
    public void exec12() {
        double x, exponent, result = 1;
        System.out.println("Enter two positive integer : ");
        System.out.println("x : ");
        x = scanner.nextInt();
        System.out.println("y : ");
        exponent = scanner.nextInt();
        for (; exponent != 0; --exponent) {
            result *= x;
        }
        System.out.println("Answer = " + result);
    }

    //Enter a positive integer n. Find and display the product of the first n positive odd integers.
    @Override
    public void exec13() {
        int x, prod = 1;
        System.out.println("Enter a positive integer : ");
        x = scanner.nextInt();
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                prod *= i;
            }
        }
        System.out.printf("The product of the first %d positive odd integers : %d ", x, prod);

    }

    //Enter integer positive numbers n and m, m < n. Find and display the product of the first n positive integers, excluding m.
    @Override
    public void exec14() {
        int x, y, prod = 1;
        System.out.println("Enter two positive integer : ");
        System.out.println("x : ");
        x = scanner.nextInt();
        System.out.println("y : ");
        y = scanner.nextInt();

        while (y >= x) {
            System.out.println("Enter integer smaller than " + x + " : ");
            System.out.println("y : ");
            y = scanner.nextInt();
        }

        for (int i = 1; i <= x; i++) {
            if (i != y) {
                prod *= i;
            }
        }
        System.out.println("Result :  " + prod);
    }

    //Enter integer positive numbers n and m, m < n. Find and display the sum of the first n positive integers, excluding m.
    @Override
    public void exec15() {
        int x, y, prod = 0;
        System.out.println("Enter two positive integer : ");
        System.out.println("x : ");
        x = scanner.nextInt();
        System.out.println("y : ");
        y = scanner.nextInt();

        while (y >= x) {
            System.out.println("Enter integer smaller than " + x + " : ");
            System.out.println("y : ");
            y = scanner.nextInt();
        }

        for (int i = 0; i <= x; i++) {
            if (i != y) {
                prod += i;
            }
        }
        System.out.println("Result :  " + prod);
    }

    //Enter an integer - the number of degrees angle. Find and display the value of the sine of an angle.
    @Override
    public void exec16() {
        double x, y;
        System.out.println("Enter a degree : ");
        x = scanner.nextInt();
        y = Math.sin(x);
        System.out.println("Value of sine(" + x + ") is : " + y);
    }

    //Enter an integer - the number of degrees angle. Find and display the value of the cosine of the angle.
    @Override
    public void exec17() {
        double x, y;
        System.out.println("Enter a degree : ");
        x = scanner.nextInt();
        y = Math.cos(x);
        System.out.println("Value of cosine(" + x + ") is : " + y);
    }

    //Enter an integer - the number of degree n. Find and display the sum of sines of angles in degrees from unity to n
    @Override
    public void exec18() {
        double x, y, sum = 0, radians;
        System.out.println("Enter a degree to start : ");
        x = scanner.nextInt();
        System.out.println("Enter a degree to sum between " + x + " : ");
        y = scanner.nextInt();
        for (int i = 0; i <= y; i++) {
            radians = Math.toRadians(x);
            sum += radians;
        }
        System.out.println("Result : " + sum);
    }

    //Create a recursive function for calculating the sum of squares of the first n numbers.
    @Override
    public void exec19() {
        int x, sum = 0;
        System.out.println("The sum of squares of the first n numbers : ");
        x = scanner.nextInt();
        sumOfSquared(x);
        sum = sumOfSquared(x);
        System.out.println("The sum of squares of the first " + x + " numbers : " + sum);
    }

    public int sumOfSquared(int x) {
        int squares = 1, total = 0;
        for (int i = 0; i <= x; i++) {
            squares = i * i;
            total += squares;
        }
        return total;
    }

    //Create a recursive function for calculating the product of the sines of the first n natural numbers.
    @Override
    public void exec20() {
        double degrees, result;
        System.out.println("Please enter degree : ");
        degrees = scanner.nextDouble();
        result = productOfSines(degrees);
        System.out.println("Result : " + result);
    }

    public double productOfSines(double degrees) {
        double radiansSin = Math.toRadians(degrees);
        double valueSin = Math.cos(radiansSin);
        double radiansCos = Math.toRadians(degrees);
        double valueCos = Math.cos(radiansCos);
        double radiansTan = Math.toRadians(degrees);
        double valueTan = Math.tan(radiansTan);

        return valueSin * valueCos * valueTan;
    }

    private static void initializeAndAsk() {
        lab4_Exercises lab4_exercises = new lab4_Exercises();
        System.out.println("Please choose exercise number between 1-20 : ");
        Scanner scanner = new Scanner(System.in);
        String number;
        number = scanner.nextLine();

        switch (number) {
            case "1":
                lab4_exercises.exec1();
                break;
            case "2":
                lab4_exercises.exec2();
                break;
            case "3":
                lab4_exercises.exec3();
                break;
            case "4":
                lab4_exercises.exec4();
                break;
            case "5":
                lab4_exercises.exec5();
                break;
            case "6":
                lab4_exercises.exec6();
                break;
            case "7":
                lab4_exercises.exec7();
                break;
            case "8":
                lab4_exercises.exec8();
                break;
            case "9":
                lab4_exercises.exec9();
                break;
            case "10":
                lab4_exercises.exec10();
                break;
            case "11":
                lab4_exercises.exec11();
                break;
            case "12":
                lab4_exercises.exec12();
                break;
            case "13":
                lab4_exercises.exec13();
                break;
            case "14":
                lab4_exercises.exec14();
                break;
            case "15":
                lab4_exercises.exec15();
                break;
            case "16":
                lab4_exercises.exec16();
                break;
            case "17":
                lab4_exercises.exec17();
                break;
            case "18":
                lab4_exercises.exec18();
                break;
            case "19":
                lab4_exercises.exec19();
                break;
            case "20":
                lab4_exercises.exec20();
                break;
        }


    }
}
