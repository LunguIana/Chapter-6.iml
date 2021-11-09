package ex_16;
import java.util.Scanner;
public class Multiples {

    public static boolean isMultiple(int first, int second){

        if(second%first == 0)

            return true;

        else

            return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("Enter one number: ");

            int first = sc.nextInt();

            System.out.print("Enter a second number: ");

            int second = sc.nextInt();

            if(isMultiple(first, second))

                System.out.println(second+" is multiple of "+first);

            else

                System.out.println(second+" is not multiple of "+first);

            System.out.print("Another pair(y/n)= ");

            char c = sc.next().charAt(0);

            if('y' != Character.toLowerCase(c))

                break;

        }

    }

}