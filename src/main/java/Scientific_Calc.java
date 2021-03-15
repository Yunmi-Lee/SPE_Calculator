
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;
import java.util.Scanner;

public class Scientific_Calc {

    private static final Logger LOGGER = LogManager.getLogger(Scientific_Calc.class.getName());

    public static void main(String[] args) {
        int choice = 0, flag = 0;
        double a = 0, b = 0;
        Scanner scan = new Scanner(System.in);

        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));

        LOGGER.debug("Scientific_Calc main start");
        System.out.println("** SPE Scientific Calculator **");
        do {
            System.out.println("1: Square root function\n2: Factorial function\n3: Natural logarithm (base е)\n4: Power function\nOthers: Exit");
            System.out.print("-------------------------\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            if (choice > 4 || choice < 1) {
                flag = 1;
                System.out.println("Exit, Bye");
                LOGGER.error("Invalid input, Entered input is beyond the choice.");
                LOGGER.debug("Scientific_Calc main end");
                break;

            } else if (flag != 1) {

                if (choice != 4) {
                    System.out.print("Enter a number: ");
                    a = scan.nextDouble();
                }

                switch (choice) {
                    case 1: {
                        LOGGER.info("[SQRT] - " + a);
                        System.out.println("------> Square root of " + a + " = " + Math.sqrt(a));
                        LOGGER.info("[RESULT] - " + Math.sqrt(a));
                        break;
                    }
                    case 2: {
                        LOGGER.info("[FRACTIONAL] - " + a);
                        System.out.println("------> Factorial of " + a + " = " + FactorialFunc(a));
                        LOGGER.info("[RESULT] - " + FactorialFunc(a));
                        break;
                    }
                    case 3: {
                        LOGGER.info("[NATURAL LOG] - " + a);
                        System.out.println("------> Natural logarithm (base е) of " + a + " = " + Math.log(a));
                        LOGGER.info("[RESULT] - " + Math.log(a));
                        break;
                    }
                    case 4: {
                        System.out.println("Enter two numbers");
                        System.out.print("Enter number 1: ");
                        a = scan.nextDouble();
                        System.out.print("Enter number 2: ");
                        b = scan.nextDouble();
                        LOGGER.info("[POWER] - " + a + " of " + b);
                        System.out.println("------> " + b + " Power of " + a + " = " + Math.pow(a, b));
                        LOGGER.info("[RESULT] - " + Math.pow(a, b));
                        break;
                    }
                    default: {
                        System.out.println("Exit, Bye");
                        LOGGER.error("Invalid input, Entered input is beyond the choice.");
                        flag = 1;
                        LOGGER.debug("Scientific_Calc main end");
                    }
                }
            }
            System.out.println("\n");
            LOGGER.debug("Scientific_Calc main running");

        } while (flag == 0);
    }

    static double FactorialFunc(double p) {
        if (p == 0)
            return 1;
        else
            return (p * FactorialFunc(p - 1));
    }

    Boolean verifySqrRoot(double n, double e) {
        System.out.println("Verify result: square root for number " + n);
        if (Math.sqrt(n) == e) {
            return true;
        } else {
            return false;
        }
    }

    Boolean verifyFactorial(double n, double e) {
        System.out.println("Verify result: factorial for number " + n);
        if (FactorialFunc(n) == e) {
            return true;
        } else {
            return false;
        }
    }

    Boolean verifyNaturalLog(double n, double e) {
        System.out.println("Verify result: natural logarithm for number " + n);
        if (Math.log(n) == e) {
            return true;
        } else {
            return false;
        }
    }

    Boolean verifyPower(double n1, double n2, double e) {
        System.out.println("Verify result: power for number1 - " + n1 + " number2 - " + n2);
        if (Math.pow(n1, n2) == e) {
            return true;
        } else {
            return false;
        }
    }
}
