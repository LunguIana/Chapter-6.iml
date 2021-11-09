package ex_19;
import java.util.Scanner;
public class Character {
    Scanner input = new Scanner(System.in);
    private void squareOfCharacters ( ) {
        int size;
        String fillCharacter;
        System.out.print("Enter the size:");
        size = input.nextInt();
        System.out.print("Enter the character:");
        fillCharacter = input.next();
        for ( int m = 0; m < size; ++m ) {
            for ( int n = 0; n < size; ++n )
            { System.out.print( fillCharacter ); }
            System.out.println( );
        }
    }
    public static void main (String[] args ) {
        Character object = new Character ( );
        object.squareOfCharacters ( );
    }

}
