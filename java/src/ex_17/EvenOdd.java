package ex_17;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int integer;
        System.out.println("Odd even integer test.");
        System.out.printf("Input CTRL-Z on Windows or CTRL-D on UNIX/Linux to end input\n"
                        + "or an integer between values\n"
                        + "%d and %d\n"
                        + "to test whether it is odd or even: ",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                integer = input.nextInt();
                System.out.printf("\n%d is "
                        + (EvenOdd.isEven(integer) ? "even.\n\n" : "odd.\n\n"), integer);
            } else {
                System.out.printf("\nInput %s invalid! Try again...\n\n", input.next());
            }
            input.nextLine();
            System.out.printf("Input CTRL-Z to end input\n"
                            + "or an integer between values\n"
                            + "%d and %d\n"
                            + "to test whether it is odd or even: ",
                    Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }

    static boolean isEven(int integer) {
        return ((integer % 2) == 0);
    }
}

