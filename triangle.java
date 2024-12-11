package triangle;

import java.util.Scanner;

public class triangle {
	// Zaiah Nance

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
        int how_many;
        // This assigns the number of rows according to user input
        int i;
        int j;
        System.out.println( "Welcome to Triangle Maker! Enter the size of the triangle" );
        how_many = input.nextInt();
        for( i = 1; i <= how_many; i++) {
            for( j = 1; j <= i; j++ ) {
                System.out.print( "*" );
            }
            System.out.println();
        }
        for( i = how_many-1; i > 0; i--) {
            for( j = i; j >= 1; j-- ) {
                System.out.print( "*" );
            }
            System.out.println();
        }
    }
}