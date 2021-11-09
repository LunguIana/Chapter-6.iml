package ex_18;
import java.util.Scanner;
public class Asterisks {
    Scanner input = new Scanner(System.in);
    private void squareOfAsterisks ( ) {
        int size;
        System.out.print("Enter the size:");
        size = input.nextInt();
        for ( int m = 0; m < size; ++m ) {

            for ( int n = 0; n < size; ++n )

            { System.out.print( "*" ); }

            System.out.println( );
        }
    }
    public static void main (String[] args ) {
        Asterisks object = new Asterisks ( );
        object.squareOfAsterisks ( );
    }
}
