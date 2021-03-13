import java.lang.Math;
import java.util.Scanner;

public class Scientific_Calc {
    public static void main(String[] args) {
        int choice = 0, flag = 0;
        double a = 0,b = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("** SPE Scientific Calculator **");
        do {
            System.out.println("1: Square root function\n2: Factorial function\n3: Natural logarithm (base е)\n4: Power function\nOthers: Exit");
            System.out.print("-------------------------\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Exit, Bye");
                break;

            } else if (flag != 1) {

                if (choice != 4) {
                    System.out.print("Enter a number: ");
                    a = scan.nextDouble();
                }

                switch(choice) {
                    case 1: System.out.println("------> Square root of " + a + " = " + Math.sqrt(a));
                        break;
                    case 2: System.out.println("------> Factorial of " + a + " = " + FactorialFunc(a));
                        break;
                    case 3: System.out.println("------> Natural logarithm (base е) of " + a + " = " + Math.log(a));
                        break;
                    case 4: {
                        System.out.println("Enter two numbers");
                        System.out.print("Enter number 1: ");
                        a = scan.nextDouble();
                        System.out.print("Enter number 2: ");
                        b = scan.nextDouble();
                        System.out.println("------> " + b + " Power of " + a + " = " + Math.pow(a, b));
                        break;
                    }
                    default: {
                        System.out.println("Exit, Bye");
                        flag = 1;
                    }
                }
            }
            System.out.println("\n");

        }while(flag == 0);
    }

    static double FactorialFunc(double p) {
        if (p == 0)
            return 1;
        else
            return(p * FactorialFunc(p-1));
    }

}
